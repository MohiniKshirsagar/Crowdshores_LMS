package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	protected JLabel lblDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserLogin() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(140, 37, 151, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(114, 92, 61, 20);
		contentPane.add(lblNewLabel_1);
		
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {}
				}
		);
		textField.setBounds(231, 94, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(102, 134, 90, 19);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(231, 135, 115, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username= textField.getText();
				String pwd= passwordField.getText();
				
					if(username.equals("Mohini")&& pwd.equals("ABC@123") ){
						User u=new User();				
					    u.setVisible(true);
			
					
				}else {	 
					JOptionPane.showMessageDialog(null,"Invalid username or password");
					
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(167, 179, 89, 23);
		contentPane.add(btnNewButton);
	}
}

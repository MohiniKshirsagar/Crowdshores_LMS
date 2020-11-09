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
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JPasswordField Password;
	protected JLabel lblDisplay;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(117, 26, 172, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(77, 93, 95, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(77, 145, 80, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btnNewButton.setBounds(160, 187, 89, 23);
		contentPane.add(btnNewButton);
		
		Username = new JTextField();
		Username.setBounds(198, 92, 145, 20);
		contentPane.add(Username);
		Username.setColumns(10);
		
		Password = new JPasswordField();
		Password.setBounds(198, 144, 145, 20);
		contentPane.add(Password);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS","root","");
					PreparedStatement psm=con.prepareStatement("insert into Admin(Username,Password) values(?,?);");
							
							psm.setString(1, Username.getText());
							
							psm.setString(2, Password.getText());
							int y= psm.executeUpdate();
							if(y>0) {
								Admin a= new Admin();
								a.setVisible(true);
								
								System.out.println("Login done Successfully..");
								JOptionPane.showMessageDialog(null,"Login done Successfully..");
								
							}else {
								System.out.println("Login failed..");
								JOptionPane.showMessageDialog(null,"Invalid username or password");
								
									
							}}catch(Exception e1) {
								System.out.println(e1);
							} 
				

			}
				/*String username= textField.getText();
				String pwd= passwordField.getText();
			
				if(username.equals("Admin")&& pwd.equals("password") ){
					//JOptionPane.showMessageDialog(Frame,"Login Successful!");
					Admin a= new Admin();
					a.setVisible(true);
					
				
			}else {	 
				JOptionPane.showMessageDialog(null,"Invalid username or password");
				
			}
				
			}*/
		});
	/*	btnNewButton.setBounds(160, 187, 89, 23);
		contentPane.add(btnNewButton);
		
		ID = new JTextField();
		ID.setBounds(198, 90, 145, 20);
		contentPane.add(ID);
		ID.setColumns(10);
		
		Password = new JPasswordField();
		Password.setBounds(198, 144, 145, 20);
		contentPane.add(Password); */
	}
}

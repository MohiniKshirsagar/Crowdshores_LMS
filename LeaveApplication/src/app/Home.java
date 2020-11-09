package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(72, 209, 204));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Leave Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(32, 26, 370, 39);
		panel.add(lblNewLabel);
		
		JButton User = new JButton("User");
		User.setFont(new Font("Tahoma", Font.BOLD, 14));
		User.setToolTipText("");
		User.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin uh=new UserLogin();				
			    uh.setVisible(true);
	
			}
		});
		User.setBounds(84, 132, 96, 31);
		panel.add(User);
		
		JButton btnNewBut_1 = new JButton("New button");
		btnNewBut_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
			
		JButton Admin = new JButton("Admin");
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin ah=new AdminLogin();				
			    ah.setVisible(true);
	
			}
		});
		Admin.setFont(new Font("Tahoma", Font.BOLD, 14));
		Admin.setBounds(231, 132, 96, 31);
		panel.add(Admin);
	}
}

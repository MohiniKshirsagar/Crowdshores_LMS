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
import java.sql.*;
public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
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
		
		
		username = new JTextField();
		username.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {}
				}
		);
		username.setBounds(231, 94, 115, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(102, 134, 90, 19);
		contentPane.add(lblNewLabel_2);
		
		password = new JPasswordField();
		password.setBounds(231, 135, 115, 20);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS","root","");
					PreparedStatement ps=con.prepareStatement("insert into User(username,password) values(?,?);");
							
							ps.setString(1, username.getText());
							
							ps.setString(2, password.getText());
							int x= ps.executeUpdate();
							if(x>0) {
								Apply u=new Apply();				
							    u.setVisible(true);
					
								System.out.println("Login done Successfully..");
								JOptionPane.showMessageDialog(null,"Login done Successfully..");
								
							}else {
								
								System.out.println("Login failed..");
								JOptionPane.showMessageDialog(null,"Invalid username or password");
								
									
							}}catch(Exception e1) {
								System.out.println(e1);
							} 
				
							
			/*		Statement stmt=conn.createStatement();
					String sql="Select " from tbLogin where UserName='"+user.getText()+"' and Password='"pass.getText();.toString()+"'";
				ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null,"Login Successfully..");
					}else {
						JOptionPane.showMessageDialog(null,"Invalid username or password");
						con.close();
					}
					
				}catch(Exception e) {System.out.println(e);} */
			/*	String username= textField.getText();
				String pwd= passwordField.getText();
				
					if(username.equals("Mohini")&& pwd.equals("ABC@123") ){ 
						User u=new User();				
					    u.setVisible(true);*/
			
					
		/*	}else {	 
					JOptionPane.showMessageDialog(null,"Invalid username or password");
					
				}*/
				}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(167, 179, 89, 23);
		contentPane.add(btnNewButton);
	}
}

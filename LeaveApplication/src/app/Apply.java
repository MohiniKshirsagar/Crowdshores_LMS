package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
public class Apply extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apply frame = new Apply();
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
	public Apply() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Leave Type");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(59, 52, 87, 15);
		contentPane.add(lblNewLabel);
		
		rdbtnNewRadioButton = new JRadioButton("Sick");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Sick";
				
			}
		});
		rdbtnNewRadioButton.setBounds(171, 49, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Casual");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Casual";
			}
		});
		rdbtnNewRadioButton_1.setBounds(291, 49, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Public Holiday");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Public Holiday";
			}
		});
		rdbtnNewRadioButton_2.setBounds(171, 75, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton Apply = new JButton("Apply");
		Apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS","root","");
					PreparedStatement pst=con.prepareStatement("insert into apply(type,FDate,TDate,Description) values(?,?,?,?);");
					
					
					pst.setString(1,type);
					pst.setString(2, FDate.getText());
					pst.setString(3, TDate.getText());
					pst.setString(4, Description.getText());
						
					int p= pst.executeUpdate();
					if(p>0) {
						 Home hm =new Home();
						 hm.setVisible(true);	
                       
						JOptionPane.showMessageDialog(null,"Leave applied successfilly!");
						
					}else {			
						JOptionPane.showMessageDialog(null,"Please try again.");
					
					
				}
					
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex);
					
				}
			}
		});
		Apply.setFont(new Font("Tahoma", Font.BOLD, 12));
		Apply.setBounds(144, 227, 89, 23);
		contentPane.add(Apply);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Other");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Other";
			}
		});
		rdbtnNewRadioButton_4.setBounds(291, 75, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JLabel FromDate = DefaultComponentFactory.getInstance().createLabel("From Date");
		FromDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		FromDate.setBounds(59, 158, 80, 23);
		contentPane.add(FromDate);
		
		JLabel ToDate = new JLabel("To Date");
		ToDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		ToDate.setBounds(59, 195, 68, 21);
		contentPane.add(ToDate);
		
		JLabel lblNewLabel_1 = new JLabel("Apply For Leave");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(119, 11, 202, 35);
		contentPane.add(lblNewLabel_1);
		
		FDate = new JTextField();
		FDate.setBounds(171, 159, 109, 23);
		contentPane.add(FDate);
		FDate.setColumns(10);
		
		TDate = new JTextField();
		TDate.setBounds(171, 193, 109, 23);
		contentPane.add(TDate);
		TDate.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Description");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(59, 110, 80, 23);
		contentPane.add(lblNewLabel_2);
		
		Description = new JTextArea();
		Description.setBounds(171, 105, 229, 47);
		contentPane.add(Description);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Other");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="Other";
			}
		});
				
	}
	private String type;
	private JTextField FDate;
	private JTextField TDate;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JTextArea Description;
	public JRadioButton getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton;
	}
	public JRadioButton getRdbtnNewRadioButton_1() {
		return rdbtnNewRadioButton_1;
	}
}

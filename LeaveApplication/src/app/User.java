package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class User extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		getContentPane().setBackground(new Color(72, 209, 204));
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Apply For Leaves");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(93, 11, 331, 48);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(77, 182, 258, 42);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Select Leave Type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(77, 70, 117, 22);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin al=new AdminLogin();
				al.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(172, 227, 89, 23);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Sick");
		comboBox.addItem("Casual");
		comboBox.addItem("Maternity");
		comboBox.addItem("Public Holiday");
		comboBox.addItem("Religious Holiday");
		comboBox.addItem("Other");
		
		comboBox.setBounds(233, 72, 102, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("From Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(76, 103, 78, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("To Date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(76, 127, 69, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Description");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(76, 152, 82, 32);
		getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 101, 102, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(233, 125, 102, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}

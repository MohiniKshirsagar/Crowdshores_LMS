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
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(184, 27, 87, 32);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(233, 90, 102, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(72, 90, 67, 18);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Leave Type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(72, 119, 78, 22);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin a=new Admin();
				a.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(167, 202, 89, 23);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Half Day");
		comboBox.addItem("Full Day");
		
		comboBox.setBounds(233, 121, 102, 22);
		getContentPane().add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(233, 157, 102, 20);
		getContentPane().add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("How Many Days");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(72, 159, 117, 23);
		getContentPane().add(lblNewLabel_3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}

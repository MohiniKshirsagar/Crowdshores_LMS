package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(168, 35, 102, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reject Leave");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(223, 106, 152, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" Approve Leave");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(68, 106, 136, 23);
		contentPane.add(btnNewButton_1);
	}

}

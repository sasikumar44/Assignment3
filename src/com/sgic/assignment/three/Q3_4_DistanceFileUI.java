package com.sgic.assignment.three;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q3_4_DistanceFileUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q3_4_DistanceFileUI frame = new Q3_4_DistanceFileUI();
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
	public Q3_4_DistanceFileUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DISTANCE BETWEEN CITY");
		lblNewLabel.setBounds(10, 66, 424, 25);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("Enter Distance");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Q3_5_StoreDistanceFile().setVisible(true);
				
			}
		});
		button.setBounds(63, 114, 122, 25);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("Find Distance");
		btnNewButton.setBounds(269, 114, 115, 25);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Q3_6_GetDistanceFile().setVisible(true);
			}
		});
		
		

	}
}


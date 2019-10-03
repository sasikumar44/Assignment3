package com.sgic.assignment.three;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Q6_1__UI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String args[]) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q6_1__UI fr = new Q6_1__UI();
					fr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Q6_1__UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("MULTIPLE CHOICE QUESTION");
		lb1.setBounds(140,20,350,30);
		Font f = new Font("serif",Font.BOLD,20);
		lb1.setFont(f);
		contentPane.add(lb1);
		
		JButton b1 = new JButton("Save Question");
		b1.setBounds(80,80,150,30);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Take Exam");
		b2.setBounds(350,80,150,30);
		contentPane.add(b2);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Q6_2__SaveQuestion().setVisible(true);
			}
			
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Q6_3__TakeExam().setVisible(true);
			}
			
		});
		
	}
}

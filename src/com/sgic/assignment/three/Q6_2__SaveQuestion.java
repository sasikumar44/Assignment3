package com.sgic.assignment.three;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Q6_2__SaveQuestion extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String args[]) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q6_2__SaveQuestion fr = new Q6_2__SaveQuestion();
					fr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Q6_2__SaveQuestion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("MULTIPLE CHOICE QUESTION");
		lb1.setBounds(120,20,350,30);
		Font f = new Font("serif",Font.BOLD,20);
		lb1.setFont(f);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("Enter Question:");
		lb2.setBounds(40,60,100,20);
		contentPane.add(lb2);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(50,90,450,40);
		contentPane.add(tf1);
		
		JLabel lb3 = new JLabel("Add Choices:");
		lb3.setBounds(40,150,100,20);
		contentPane.add(lb3);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(140,150,100,30);
		contentPane.add(tf2);
		
		JTextField tf3 = new JTextField();
		tf3.setBounds(140,190,100,30);
		contentPane.add(tf3);
		
		JTextField tf4 = new JTextField();
		tf4.setBounds(140,230,100,30);
		contentPane.add(tf4);
		
		JLabel lb4 = new JLabel("Correct Choice:");
		lb4.setBounds(280,150,100,20);
		contentPane.add(lb4);
		
		JTextField tf5 = new JTextField();
		tf5.setBounds(400,150,100,30);
		contentPane.add(tf5);
		
		JButton b1 = new JButton("Save Question");
		b1.setBounds(350,230,150,30);
		contentPane.add(b1);
		
		JLabel lb5 = new JLabel();
		lb5.setBounds(250,280,100,20);
		contentPane.add(lb5);
		lb5.setForeground(Color.RED);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String question;
				String c1;
				String c2;
				String c3;
				String ca;
				
				question = tf1.getText();
				c1 = tf2.getText();
				c2 = tf3.getText();
				c3 = tf4.getText();
				ca = tf5.getText();
				
				Q6_Mcq mcq = new Q6_Mcq(question,c1,c2,c3,ca);
				
				Q6_QList ql = new Q6_QList();
				ql.addToqList(mcq);
				
				lb5.setText("Saved!");
				
				for(Q6_Mcq m:ql.getqList()){  
			        System.out.println(m.getQuestion()+" "+m.getChoice_1()+" "+m.getChoice_2()+" "+m.getChoice_3()+" "+m.getCorrectChoice()); 
			    }
				
			}
			
		});
	}
}

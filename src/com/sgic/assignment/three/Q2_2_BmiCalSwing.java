package com.sgic.assignment.three;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q2_2_BmiCalSwing {
	public static void main(String args[]) {
		JFrame fr = new JFrame();
		
		JLabel lb1 = new JLabel("BMI CALCULATOR");
		lb1.setBounds(50, 50, 300, 50);
		Font f = new Font("serif",Font.BOLD,30);
		lb1.setFont(f);
		fr.add(lb1);
		
		JLabel lb2 = new JLabel("Height (m) :");
		lb2.setBounds(45,85,80,50);
		fr.add(lb2);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(130,100,200,20);
		fr.add(tf1);
		
		JLabel lb3 = new JLabel("Weight (kg) :");
		lb3.setBounds(40,120,80,50);
		fr.add(lb3);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(130,135,200,20);
		fr.add(tf2);
		
		JButton b = new JButton("Calculate");
		b.setBounds(230,170,100,25);
		fr.add(b);
		
		JLabel lb4 = new JLabel("Your BMI is : ");
		lb4.setBounds(80,200,80,50);
		fr.add(lb4);
		
		JLabel lb5 = new JLabel();
		lb5.setBounds(160,200,20,50);
		fr.add(lb5);
		
		JLabel lb6 = new JLabel();
		lb6.setBounds(190,200,140,50);
		fr.add(lb6);
				
		fr.setSize(500,300);
		fr.setLayout(null);
		fr.setVisible(true);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				double h = Double.parseDouble(tf1.getText());
				double w = Double.parseDouble(tf2.getText());
				int bmi = (int) (w/(h*h));
				lb5.setText(Integer.toString(bmi));
				
				if(bmi<=16) {
					lb6.setText("You are Thin");
					lb6.setForeground(Color.ORANGE);
				}
				else if(bmi<=23) {
					lb6.setText("You are Normal");
					lb6.setForeground(Color.GREEN);
				}
				else {
					lb6.setText("You are Obese");
					lb6.setForeground(Color.RED);
				}
			}
			
		});
	}
}

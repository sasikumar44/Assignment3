package com.sgic.assignment.three;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2_1_BmiCalAwt {
	Q2_1_BmiCalAwt(){
		Frame fr = new Frame();
		
		Label lb1 = new Label("BMI CALCULATOR");
		lb1.setBounds(50, 50, 300, 50);
		Font f = new Font("serif",Font.BOLD,30);
		lb1.setFont(f);
		fr.add(lb1);
		
		Label lb2 = new Label("Height (m) :");
		lb2.setBounds(45,85,80,50);
		fr.add(lb2);
		
		TextField tf1 = new TextField();
		tf1.setBounds(130,100,200,20);
		fr.add(tf1);
		
		Label lb3 = new Label("Weight (kg) :");
		lb3.setBounds(40,120,80,50);
		fr.add(lb3);
		
		TextField tf2 = new TextField();
		tf2.setBounds(130,135,200,20);
		fr.add(tf2);
		
		Button b = new Button("Calculate");
		b.setBounds(250,170,80,25);
		fr.add(b);
		
		Label lb4 = new Label("Your BMI is : ");
		lb4.setBounds(80,200,80,50);
		fr.add(lb4);
		
		Label lb5 = new Label();
		lb5.setBounds(160,200,20,50);
		fr.add(lb5);
		
		Label lb6 = new Label();
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
	
	public static void main(String args[]) {
		new Q2_1_BmiCalAwt();
	}

}

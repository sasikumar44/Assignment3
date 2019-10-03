package com.sgic.assignment.three;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Q1_B_2_SwingCal {
	public static void main(String args[]) {
		JFrame jf = new JFrame();
		
		JLabel jl = new JLabel("SIMPLE CALCULATOR");
		jl.setBounds(125,50,250,30);
		Font f = new Font("Serif",Font.BOLD,20);
		jl.setFont(f);
		jf.add(jl);
		
		 JLabel lb2 = new JLabel("First Number:");
		 lb2.setBounds(20,100,100,30);
		 jf.add(lb2);
		 
		 JTextField tf1 = new JTextField();
		 tf1.setBounds(130,100,100,30);
		 jf.add(tf1);
		 
		 JLabel lb3 = new JLabel("Second Number:");
		 lb3.setBounds(250,100,100,30);
		 jf.add(lb3);
		 
		 JTextField tf2 = new JTextField();
		 tf2.setBounds(360,100,100,30);
		 jf.add(tf2);
		 
		 JRadioButton b1 = new JRadioButton("ADD");
		 b1.setBounds(50,150,50,30);
		 jf.add(b1);
		 
		 JRadioButton b2 = new JRadioButton("SUBSTRACT");
		 b2.setBounds(120,150,110,30);
		 jf.add(b2);
		 
		 JRadioButton b3 = new JRadioButton("MULTIPLY");
		 b3.setBounds(230,150,100,30);
		 jf.add(b3);
		 
		 JRadioButton b4 = new JRadioButton("DIVIDE");
		 b4.setBounds(330,150,80,30);
		 jf.add(b4);
		 
		 ButtonGroup bg=new ButtonGroup(); 
		 bg.add(b1);
		 bg.add(b2);
		 bg.add(b3);
		 bg.add(b4);
		 
		 JButton jb1 = new JButton("Answer");
		 jb1.setBounds(180,200,100,30);
		 jf.add(jb1);
		 
		 JLabel lb4 = new JLabel("Answer is");
		 lb4.setBounds(200,250,100,30);
		 jf.add(lb4);
		
		
		jf.setSize(500,350);
		jf.setLayout(null);
		jf.setVisible(true);
		
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(b1.isSelected()) {
					int num3=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));
				}
				
				else if(b2.isSelected()) {
					int num3=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));		
				}
				
				else if(b3.isSelected()) {
					int num3=Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));		
				}
				
				else if(b4.isSelected()) {
					int num3=Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
					lb4.setText(Integer.toString(num3));		
				}
			 
			}
			
		});
		
	}

}


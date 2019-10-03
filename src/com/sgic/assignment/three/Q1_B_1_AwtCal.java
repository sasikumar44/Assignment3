package com.sgic.assignment.three;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1_B_1_AwtCal {
Q1_B_1_AwtCal(){
	 Frame fr = new Frame();
	 
	 Label lb1 = new Label("SIMPLE CALCULATOR");
	 lb1.setBounds(125,50,250,30);
	 Font f = new Font("Serif",Font.BOLD,20);
	 lb1.setFont(f);
	 fr.add(lb1);
	 
	 Label lb2 = new Label("First Number:");
	 lb2.setBounds(20,100,100,30);
	 fr.add(lb2);
	 
	 TextField tf1 = new TextField();
	 tf1.setBounds(130,100,100,30);
	 fr.add(tf1);
	 
	 Label lb3 = new Label("Second Number:");
	 lb3.setBounds(250,100,100,30);
	 fr.add(lb3);
	 
	 TextField tf2 = new TextField();
	 tf2.setBounds(360,100,100,30);
	 fr.add(tf2);
	 
	 CheckboxGroup cbg = new CheckboxGroup();
	 Checkbox cb1 = new Checkbox("ADD",cbg,false);
	 cb1.setBounds(50,150,80,30);
	 fr.add(cb1);
	 
	 Checkbox cb2 = new Checkbox("SUBSTRACT",cbg,false);
	 cb2.setBounds(150,150,100,30);
	 fr.add(cb2);
	 
	 Checkbox cb3 = new Checkbox("MULTIPLY",cbg,false);
	 cb3.setBounds(270,150,80,30);
	 fr.add(cb3);
	 
	 Checkbox cb4 = new Checkbox("DIVIDE",cbg,false);
	 cb4.setBounds(370,150,80,30);
	 fr.add(cb4);
	 
	 Button b1 = new Button("Answer");
	 b1.setBounds(180,200,100,30);
	 fr.add(b1);
	 
	 Label lb4 = new Label("Answer is");
	 lb4.setBounds(200,250,100,30);
	 fr.add(lb4);
	 
	 fr.setSize(500, 350);
	 fr.setLayout(null);
	 fr.setVisible(true);
	 
	 b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(cb1.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
				lb4.setText(Integer.toString(num3));
			}
			else if(cb2.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());
				lb4.setText(Integer.toString(num3));
			}
			else if(cb3.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
				lb4.setText(Integer.toString(num3));
			}
			else if(cb4.getState()==true) {
				int num3=Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
				lb4.setText(Integer.toString(num3));
			}
			
		}
		 
	 });
	 
 }
 
 public static void main(String args[]) {
	 	new Q1_B_1_AwtCal();
 	}
 }


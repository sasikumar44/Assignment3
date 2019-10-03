package com.sgic.assignment.three;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q4_1_TaskSwingArrayList {
	public static void main(String args[]) {
		
	ArrayList<Q4_3_Task> task = new ArrayList<Q4_3_Task>();
	
	JFrame fr = new JFrame();
	
	JLabel lb1 = new JLabel("TASK SCHEDULAR");
	lb1.setBounds(50,20,300,50);
	Font f = new Font("serif",Font.BOLD,30);
	lb1.setFont(f);
	fr.add(lb1);
	
	JLabel lb2 = new JLabel("Task");
	lb2.setBounds(70,70,80,50);
	fr.add(lb2);
	
	JLabel lb3 = new JLabel("Elapsed Time");
	lb3.setBounds(230,70,100,50);
	fr.add(lb3);
	
	JTextField tf1 = new JTextField();
	tf1.setBounds(20,120,150,25);
	fr.add(tf1);
	
	JTextField tf2 = new JTextField();
	tf2.setBounds(200,120,150,25);
	fr.add(tf2);
	
	JButton b1 = new JButton("ADD");
	b1.setBounds(380,120,80,25);
	fr.add(b1);
	
	JPanel p1 = new JPanel();
	p1.setBounds(20,170,440,40);
	p1.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.0f)));
	
	JLabel lb4 = new JLabel();
	lb4.setBounds(30,200,150,25);
	
	JLabel lb5 = new JLabel();
	lb5.setBounds(210,200,50,25);
	
	JButton b2 = new JButton("DELETE");
	b2.setBounds(270,200,80,25);
	
	JCheckBox cb1 = new JCheckBox("Complete");
	cb1.setBounds(370,200,80,25);	
	
	p1.add(lb4);
	p1.add(lb5);
	p1.add(b2);
	p1.add(cb1);
	fr.add(p1);
	p1.setVisible(false);
		
	fr.setSize(500,300);
	fr.setLayout(null);
	fr.setVisible(true);

	b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			p1.setVisible(true);
			if(cb1.isSelected()) {
				cb1.setSelected(false);
				p1.setBackground(null);
			}
			lb4.setText(tf1.getText());
			lb5.setText(tf2.getText());
			
			Q4_3_Task t = new Q4_3_Task(tf1.getText(),tf2.getText());
			task.add(t);
			
			Iterator<Q4_3_Task> itr=task.iterator();  
			while(itr.hasNext()){  
			  Q4_3_Task tk=(Q4_3_Task)itr.next();  
			  System.out.println(tk.getTaskName()+" "+tk.getTaskDuration()+" "+tk.getStatus());  
			} 
			
		}
		
	});
	
	cb1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(cb1.isSelected()) {
				task.get(task.size()-1).setStatus("Completed");
				p1.setBackground(Color.GREEN);
			}
			else {
				task.get(task.size()-1).setStatus("New");
				p1.setBackground(null);
			}
		}
		
	});
	
	b2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!lb4.getText().isEmpty()) {
				lb4.setText("");
				lb5.setText("");
				task.remove(task.size()-1);
				p1.setVisible(false);
			}			
		}
		
	});
	
	}

}

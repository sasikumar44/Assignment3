package com.sgic.assignment.three;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Q6_5_TakeExamDb extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int n=-1,m=0,count=0;
	private String correct;

	public static void main(String args[]) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q6_5_TakeExamDb fr = new Q6_5_TakeExamDb();
					fr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Q6_5_TakeExamDb() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("MULTIPLE CHOICE QUESTION");
		lb1.setBounds(40,20,350,30);
		Font f = new Font("serif",Font.BOLD,20);
		lb1.setFont(f);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel();
		lb2.setBounds(50,80,400,30);
		lb2.setForeground(Color.RED);
		contentPane.add(lb2);
		
		JRadioButton rb1 = new JRadioButton();
		rb1.setBounds(60,140,120,30);
		contentPane.add(rb1);
		rb1.setVisible(false);
		
		JRadioButton rb2 = new JRadioButton();
		rb2.setBounds(200,140,120,30);
		contentPane.add(rb2);
		rb2.setVisible(false);
		
		JRadioButton rb3 = new JRadioButton();
		rb3.setBounds(350,140,120,30);
		contentPane.add(rb3);
		rb3.setVisible(false);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		JButton b1 = new JButton("Start");
		b1.setBounds(420,200,150,30);
		contentPane.add(b1);
		
		JLabel lb3 = new JLabel();
		lb3.setBounds(120,200,150,30);
		contentPane.add(lb3);
		lb3.setForeground(Color.RED);
	
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Q6_QList ql = new Q6_QList();
							
				if(b1.getText().equals("Start")) {
					Q6_Services s = new Q6_Services();
					ResultSet rs = s.getData();
					try {
						while (rs.next()) {
							String ques;
							String str;
							String corr;
							ques = rs.getString("question");
							str = rs.getString("Choices");
							corr = rs.getString("Correct_Answer");
						  
							List<String> choices = Arrays.asList(str.split(","));
							  
							Q6_Mcq mcq = new Q6_Mcq(ques,choices.get(0),choices.get(1),choices.get(2),corr);

							ql.addToqList(mcq);
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();

		            if (button.isSelected()) {
		                if(button.getText().equals(correct)) {
		                	count++;
		                }
		            }
		        }
				
				if(b1.getText().contentEquals("Finish")) {
					lb3.setText(count+" Correct Answers!");
					return;
				}
				
				bg.clearSelection();
				
				++n;
				++m;
				
				for(int i=n; i<m && i<ql.getqList().size(); i++) {
					if(i==0) {
						rb1.setVisible(true);
						rb2.setVisible(true);
						rb3.setVisible(true);
						b1.setText("Next Question");
					}
					
					lb2.setText(ql.getqList().get(n).getQuestion());
					rb1.setText(ql.getqList().get(n).getChoice_1());
					rb2.setText(ql.getqList().get(n).getChoice_2());
					rb3.setText(ql.getqList().get(n).getChoice_3());
					correct = ql.getqList().get(n).getCorrectChoice();
					
					if(i==ql.getqList().size()-1) {
						b1.setText("Finish");
					}
				}
				
			}
			
		});
	}
}

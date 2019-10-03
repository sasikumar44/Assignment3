package com.sgic.assignment.three;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Q5_1_Candidate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String[] front = new String[5];
	private String[] back = new String[5];
	private String[] frame = new String[4];
	private String nic;
	private String name;
	private String frontend;
	private String backend;
	private String framework;
	
	private int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q5_1_Candidate frame = new Q5_1_Candidate();
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
	public Q5_1_Candidate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NIC No :");
		lblNewLabel.setBounds(43, 58, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCandidate = new JLabel("CANDIDATE SKILL SET");
		lblCandidate.setBounds(134, 11, 170, 19);
		lblCandidate.setHorizontalAlignment(SwingConstants.CENTER);
		lblCandidate.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblCandidate);
		
		textField = new JTextField();
		textField.setBounds(105, 55, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(274, 58, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(330, 55, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSkillSet = new JLabel("Skill Set");
		lblSkillSet.setBounds(43, 102, 46, 14);
		contentPane.add(lblSkillSet);
		
		JPanel panel = new JPanel();
		panel.setBounds(105, 106, 97, 144);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxRejectJs = new JCheckBox("Reject JS");
		panel.add(chckbxRejectJs);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Vue JS");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Angular JS");
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxAngular = new JCheckBox("Angular");
		panel.add(chckbxAngular);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("JQuery");
		panel.add(chckbxNewCheckBox_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(240, 102, 89, 148);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxC_1 = new JCheckBox("C");
		panel_1.add(chckbxC_1);
		
		JCheckBox chckbxJava = new JCheckBox("JAVA");
		panel_1.add(chckbxJava);
		
		JCheckBox chckbxC = new JCheckBox("C++");
		panel_1.add(chckbxC);
		
		JCheckBox chckbxPhp = new JCheckBox("PHP");
		panel_1.add(chckbxPhp);
		
		JCheckBox chckbxPhyton = new JCheckBox("PYTHON");
		panel_1.add(chckbxPhyton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(361, 102, 92, 148);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxLaravel = new JCheckBox("Laravel");
		panel_2.add(chckbxLaravel);
		
		JCheckBox chckbxLumen = new JCheckBox("Lumen");
		panel_2.add(chckbxLumen);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Spring");
		panel_2.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxSpringBoot = new JCheckBox("Spring Boot");
		panel_2.add(chckbxSpringBoot);
		
		JButton btnNewButton = new JButton("APPLY");
		btnNewButton.setBounds(361, 267, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(121, 276, 199, 14);
		contentPane.add(label);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!textField.getText().isEmpty() && !textField_1.getText().isEmpty()) {
					nic = textField.getText();
					
					name = textField_1.getText();
					
					if(chckbxC_1.isSelected()) {
						back[i]= chckbxC_1.getText();
						i++;
					}
					if(chckbxC.isSelected()) {
						back[i]= chckbxC.getText();
						i++;
					}
					if(chckbxJava.isSelected()) {
						back[i]= chckbxJava.getText();
						i++;
					}
					if(chckbxPhp.isSelected()) {
						back[i]= chckbxPhp.getText();
						i++;
					}
					if(chckbxPhyton.isSelected()) {
						back[i]= chckbxPhyton.getText();
						i++;
					}
					
					i=0;
					
					if(chckbxRejectJs.isSelected()) {
						front[i]= chckbxRejectJs.getText();
						i++;
					}
					if(chckbxNewCheckBox.isSelected()) {
						front[i]= chckbxNewCheckBox.getText();
						i++;
					}
					if(chckbxNewCheckBox_1.isSelected()) {
						front[i]= chckbxNewCheckBox_1.getText();
						i++;
					}
					if(chckbxAngular.isSelected()) {
						front[i]= chckbxAngular.getText();
						i++;
					}
					if(chckbxNewCheckBox_2.isSelected()) {
						front[i]= chckbxNewCheckBox_2.getText();
						i++;
					}
					
					i=0;
					
					if(chckbxLaravel.isSelected()) {
						frame[i]= chckbxLaravel.getText();
						i++;
					}
					if(chckbxLumen.isSelected()) {
						frame[i]= chckbxLumen.getText();
						i++;
					}
					if(chckbxNewCheckBox_3.isSelected()) {
						frame[i]= chckbxNewCheckBox_3.getText();
						i++;
					}
					if(chckbxSpringBoot.isSelected()) {
						frame[i]= chckbxSpringBoot.getText();
						i++;
					}
					
					i=0;
					
					front = Arrays.stream(front).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
					back = Arrays.stream(back).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
					frame = Arrays.stream(frame).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
					
					frontend = String.join(",", front);
					backend = String.join(",", back);
					framework = String.join(",", frame);
					
					front = new String[5];
					back = new String[5];
					frame = new String[4];
					
					System.out.println(frontend);
					System.out.println(backend);
					System.out.println(framework);
					
					if(frontend.isEmpty() && backend.isEmpty() && framework.isEmpty()) {
						label.setText("Failed!::Empty Checkbox");
						label.setForeground(Color.RED);
					}
					else {
						Q5_3_Services s = new Q5_3_Services();
						s.saveData(nic,name,frontend,backend,framework);
						label.setText("Success!");
						label.setForeground(Color.GREEN);						
					}
				}
				else {
					label.setText("Failed!::Empty NIC OR Name");
					label.setForeground(Color.RED);
				}
				
			}
		});
	}
}

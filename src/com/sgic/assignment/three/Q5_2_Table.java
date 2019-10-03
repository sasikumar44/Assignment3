package com.sgic.assignment.three;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Q5_2_Table extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q5_2_Table frame = new Q5_2_Table();
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
	public Q5_2_Table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCandidateSkillSet = new JLabel("CANDIDATE SKILL SET");
		lblCandidateSkillSet.setBounds(204, 21, 246, 30);
		lblCandidateSkillSet.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblCandidateSkillSet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 101, 614, 124);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NIC Number", "Name", "Front End Skills", "Back End Skills", "Frameworks"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(96);
		table.getColumnModel().getColumn(1).setPreferredWidth(107);
		table.getColumnModel().getColumn(2).setPreferredWidth(127);
		table.getColumnModel().getColumn(3).setPreferredWidth(128);
		table.getColumnModel().getColumn(4).setPreferredWidth(115);
		
		JButton btnGetData = new JButton("Get Data");

		btnGetData.setBounds(535, 62, 89, 23);
		contentPane.add(btnGetData);
		
		JButton btnAddNewData = new JButton("Add New Data");
		btnAddNewData.setBounds(382, 62, 115, 23);
		contentPane.add(btnAddNewData);
		
		btnGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Q5_3_Services s1 = new Q5_3_Services();
				ResultSet rs = s1.getData();
				
				try {
					while(rs.next()) {
						String nic = rs.getString("NIC");
						String name = rs.getString("Name");
						String front = rs.getString("Frontend");
						String back = rs.getString("Backend");
						String frame = rs.getString("Framework");
						
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[]{nic, name, front, back, frame});
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		btnAddNewData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Q5_1_Candidate().setVisible(true);
			}
		});
	}
}

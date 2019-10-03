package com.sgic.assignment.three;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q3_6_GetDistanceFile extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q3_6_GetDistanceFile frame = new Q3_6_GetDistanceFile();
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
	public Q3_6_GetDistanceFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DISTANCE BETWEEN CITY");
		lblNewLabel.setBounds(10, 24, 424, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblFrom = new JLabel("FROM");
		lblFrom.setBounds(61, 80, 46, 14);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setBounds(186, 80, 46, 14);
		contentPane.add(lblTo);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBounds(61, 101, 75, 20);
		contentPane.add(comboBox);
		comboBox.addItem(new Q3_ComboItem("Jaffna", 0));
		comboBox.addItem(new Q3_ComboItem("Kilinochchi", 1));
		comboBox.addItem(new Q3_ComboItem("Vavuniya", 2));
		comboBox.addItem(new Q3_ComboItem("Colombo", 3));
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(182, 101, 75, 20);
		contentPane.add(comboBox_1);
		comboBox_1.addItem(new Q3_ComboItem("Jaffna", 0));
		comboBox_1.addItem(new Q3_ComboItem("Kilinochchi", 1));
		comboBox_1.addItem(new Q3_ComboItem("Vavuniya", 2));
		comboBox_1.addItem(new Q3_ComboItem("Colombo", 3));
		
		JButton btnGetDistance = new JButton("Get Distance");
		btnGetDistance.setBounds(294, 100, 118, 23);
		contentPane.add(btnGetDistance);
		
		JLabel lblDistanceFrom = new JLabel("Distance From");
		lblDistanceFrom.setBounds(10, 162, 88, 14);
		contentPane.add(lblDistanceFrom);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(114, 162, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("to");
		lblNewLabel_2.setBounds(203, 162, 15, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(223, 162, 90, 14);
		contentPane.add(label);
		
		JLabel lblIs = new JLabel("is");
		lblIs.setBounds(320, 162, 10, 14);
		contentPane.add(lblIs);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(340, 162, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblKm = new JLabel("km");
		lblKm.setBounds(396, 162, 28, 14);
		contentPane.add(lblKm);
		
		btnGetDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object item1 = comboBox.getSelectedItem();
				int value1 = ((Q3_ComboItem)item1).getValue();
				String key1 = ((Q3_ComboItem)item1).getKey();
				
				Object item2 = comboBox_1.getSelectedItem();
				int value2 = ((Q3_ComboItem)item2).getValue();
				String key2 = ((Q3_ComboItem)item2).getKey();
				
				lblNewLabel_1.setText(key1);
				label.setText(key2);
				
				label_1.setText(Integer.toString(Q3_5_StoreDistanceFile.getDistance(value1, value2)));
				
			}
		});
	}
}


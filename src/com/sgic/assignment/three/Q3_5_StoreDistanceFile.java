package com.sgic.assignment.three;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Q3_5_StoreDistanceFile extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton btnEnter;
	private int[] city = new int[16];
	private static int[][] city1 = new int[4][4];
	private static int [][] myArray = new int[4][4];
	private JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q3_5_StoreDistanceFile frame = new Q3_5_StoreDistanceFile();
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
	public Q3_5_StoreDistanceFile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDistanceBetweenCity = new JLabel("DISTANCE BETWEEN CITY");
		lblDistanceBetweenCity.setBounds(42, 11, 424, 19);
		lblDistanceBetweenCity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDistanceBetweenCity.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDistanceBetweenCity);
		
		JLabel lblNewLabel = new JLabel("Jaffna");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(104, 50, 42, 19);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Jaffna");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(42, 80, 32, 19);
		contentPane.add(label);
		
		JLabel lblKilinochchi = new JLabel("Kilinochchi");
		lblKilinochchi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKilinochchi.setBounds(19, 122, 55, 19);
		contentPane.add(lblKilinochchi);
		
		JLabel label_1 = new JLabel("Kilinochchi");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(197, 50, 64, 19);
		contentPane.add(label_1);
		
		JLabel lblVavunia = new JLabel("Vavuniya");
		lblVavunia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVavunia.setBounds(26, 162, 48, 19);
		contentPane.add(lblVavunia);
		
		JLabel label_2 = new JLabel("Vavuniya");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(298, 50, 53, 19);
		contentPane.add(label_2);
		
		JLabel lblColombo = new JLabel("Colombo");
		lblColombo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblColombo.setBounds(26, 206, 48, 19);
		contentPane.add(lblColombo);
		
		JLabel label_3 = new JLabel("Colombo");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(402, 50, 53, 19);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(85, 80, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 80, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(283, 80, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(388, 80, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(85, 122, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(187, 122, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(283, 122, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(388, 122, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(85, 161, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(187, 161, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(283, 161, 86, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(388, 161, 86, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(85, 206, 86, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(187, 206, 86, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(283, 206, 86, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(388, 206, 86, 20);
		contentPane.add(textField_15);
		
		btnEnter = new JButton("Enter Data");
		btnEnter.setBounds(365, 238, 109, 23);
		contentPane.add(btnEnter);
		
		label_4 = new JLabel("");
		label_4.setBounds(154, 247, 97, 14);
		contentPane.add(label_4);
		
		btnEnter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(insertData()) {
					try {
						writeFile();
						readFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					label_4.setText("Success!");
				}
				else {
					label_4.setText("Failed!");
				}
				
			}
			
		});
		
	}
	public boolean insertData() {
		city[0]=Integer.parseInt(textField.getText());
		city[1]=Integer.parseInt(textField_1.getText());
		city[2]=Integer.parseInt(textField_2.getText());
		city[3]=Integer.parseInt(textField_3.getText());
		city[4]=Integer.parseInt(textField_4.getText());
		city[5]=Integer.parseInt(textField_5.getText());
		city[6]=Integer.parseInt(textField_6.getText());
		city[7]=Integer.parseInt(textField_7.getText());
		city[8]=Integer.parseInt(textField_8.getText());
		city[9]=Integer.parseInt(textField_9.getText());
		city[10]=Integer.parseInt(textField_10.getText());
		city[11]=Integer.parseInt(textField_11.getText());
		city[12]=Integer.parseInt(textField_12.getText());
		city[13]=Integer.parseInt(textField_13.getText());
		city[14]=Integer.parseInt(textField_14.getText());
		city[15]=Integer.parseInt(textField_15.getText());
		
		int k=0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				city1[i][j]=city[k];
				k++;
			}
		}
		
		return true;
	}
	
	public void writeFile() throws FileNotFoundException {
		File  file = new File ("C:/users/bals9/eclipse-workspace/Assignment_3/src/com/balsp/assignment/distance.txt");
		
		PrintWriter out = new PrintWriter(file);

		for(int i = 0; i<4; i++)
		{
		    for (int j = 0; j<4; j++)
		    {           
		        out.print(city1[i][j]+" ");
		    }
		    out.println();
		}

		out.close();
	}
	
	public void readFile() throws IOException {
	      Scanner sc = new Scanner(new BufferedReader(new FileReader("C:/users/bals9/eclipse-workspace/Assignment_3/src/com/balsp/assignment/distance.txt")));
	      
	      while(sc.hasNextLine()) {
	         for (int i=0; i<myArray.length; i++) {
	            String[] line = sc.nextLine().trim().split(" ");
	            for (int j=0; j<line.length; j++) {
	               myArray[i][j] = Integer.parseInt(line[j]);
	            }
	         }
	      }
	      sc.close();
	}
	
	public static int getDistance(int a, int b) {
		return myArray[a][b];
	}
}


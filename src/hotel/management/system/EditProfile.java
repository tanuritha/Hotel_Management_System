/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;

import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditProfile extends JFrame {
        JComboBox comboBox;
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JPanel contentPane;
	private JTextField txt_Type;
	private JTable table;
        Choice c1;
        private JTextField t1,t2,t3,t4,t5,t6,t7,t8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProfile frame = new EditProfile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		this.dispose();
	}

	/**
	 * Create the frame.
	 * @throws SQLException
	 */
	public EditProfile() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 200, 850, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchForRoom = new JLabel("Edit your Profile here.");
		lblSearchForRoom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSearchForRoom.setBounds(250, 11, 310, 31);
		contentPane.add(lblSearchForRoom);
                
                
                /*************************Payment Form********************************/
                JLabel lblName_1 = new JLabel("First Name :");
		lblName_1.setBounds(35, 111, 200, 14);
		contentPane.add(lblName_1);
                t1 = new JTextField();
		t1.setBounds(271, 111, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
                
                
                JLabel lblName_2 = new JLabel("Last Name:");
		lblName_2.setBounds(35, 151, 200, 14);
		contentPane.add(lblName_2);
		t2 = new JTextField();
		t2.setBounds(271, 151, 150, 20);
		contentPane.add(t2);
		t2.setColumns(10);
                
                JLabel lblName_3 = new JLabel("ID :");
		lblName_3.setBounds(35, 191, 200, 14);
		contentPane.add(lblName_3);
                comboBox = new JComboBox(new String[] {"State ID", "Drivers license"});
		comboBox.setBounds(271, 191, 150, 20);
		contentPane.add(comboBox);
                
                JLabel lblName_4 = new JLabel("ID Number:");
		lblName_4.setBounds(35, 231, 200, 14);
		contentPane.add(lblName_4);
		t4 = new JTextField();
		t4.setBounds(271, 231, 150, 20);
		contentPane.add(t4);
		t4.setColumns(10);
                
                JLabel lblName_5 = new JLabel("Date of Birth:");
		lblName_5.setBounds(35, 271, 200, 14);
		contentPane.add(lblName_5);
		t5 = new JTextField();
		t5.setBounds(271, 271, 150, 20);
		contentPane.add(t5);
		t5.setColumns(10);
                
                JLabel lblName_6 = new JLabel("Mobile No.:");
		lblName_6.setBounds(35, 311, 200, 14);
		contentPane.add(lblName_6);
		t6 = new JTextField();
		t6.setBounds(271, 311, 150, 20);
		contentPane.add(t6);
		t6.setColumns(10);
                
                JLabel lblName_7 = new JLabel("Email:");
		lblName_7.setBounds(35, 351, 200, 14);
		contentPane.add(lblName_7);
		t7 = new JTextField();
		t7.setBounds(271, 351, 150, 20);
		contentPane.add(t7);
		t7.setColumns(10);
                
                JLabel lblName_8 = new JLabel("Password:");
		lblName_8.setBounds(35, 391, 200, 14);
		contentPane.add(lblName_8);
		t8 = new JPasswordField();
		t8.setBounds(271, 391, 150, 20);
		contentPane.add(t8);
		t8.setColumns(10);
                
                
                /*********************************************************************/
		
		
		
                /*****************Payment confirmation Dialogue box**********************/
		JButton btnSearch = new JButton("Update");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                         
                            try{
                conn c = new conn();
                            String s1 =  t1.getText();
                            String s2 =  t2.getText();
                            String s3 = (String)comboBox.getSelectedItem();
                            String s4 =  t4.getText();
                            String s5 =  t5.getText();
                            String s6 =  t6.getText();
                            String s7 =  t7.getText();
                            String s8 =  t8.getText();
               // String str = "Update user set values( '"+s1+"', '"+s2+"', '"+s3+"','"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"') Where idNumber = '+s4'";
                String str = "update user set firstName = '"+s1+"', lastName = '"+s2+"', dob = '"+s5+"', mobileNumber = '"+s6+"', emailId = '"+s7+"', password = '"+s8+"' where idNumber = '"+s4+"'";
                
		c.s.executeUpdate(str);
                JFrame frame = new JFrame("User profile Updated Successsfully!");
                JOptionPane.showMessageDialog(frame, "Success","User profile Updated Successsfully!", JOptionPane.PLAIN_MESSAGE);
          frame.setSize(350,350);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       new Login().setVisible(true);
                setVisible(false);
               
                }catch(Exception ee){
                    System.out.println(ee);
                }
			}

                  
		});
		btnSearch.setBounds(200, 440, 120, 30);
                btnSearch.setBackground(Color.BLACK);
                btnSearch.setForeground(Color.WHITE);
		contentPane.add(btnSearch);
                /**************************************************************************************/
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UserLogin().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(380, 440, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}
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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXDatePicker;



public class pay extends JFrame {
	Connection conn = null;
        JComboBox comboBox;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JPanel contentPane;
	private JTextField txt_Type;
	private JTable table;
        Choice c1;
        private JTextField t0,t1,t2,t3,t4,t5,t6,t7,t8;
        
        private JDatePickerImpl datePicker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pay frame = new pay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
                
                SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
                            try {
                                new pay().setVisible(true);
                            } catch (SQLException ex) {
                                Logger.getLogger(pay.class.getName()).log(Level.SEVERE, null, ex);
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
	public pay() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 200, 850, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchForRoom = new JLabel("Pay your Amount here.");
		lblSearchForRoom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSearchForRoom.setBounds(250, 11, 210, 31);
		contentPane.add(lblSearchForRoom);
                
                
                /*************************Payment Form********************************/
                
                JLabel lblName_00 = new JLabel("ID :");
		lblName_00.setBounds(35, 71, 200, 14);
		contentPane.add(lblName_00);
                comboBox = new JComboBox(new String[] {"State ID", "Driver license"});
		comboBox.setBounds(271, 71, 150, 20);
		contentPane.add(comboBox);
                
                JLabel lblName_0 = new JLabel("ID Number :");
		lblName_0.setBounds(35, 101, 200, 14);
		contentPane.add(lblName_0);
                t0 = new JTextField();
		t0.setBounds(271, 101, 150, 20);
		contentPane.add(t0);
		t0.setColumns(10);
                
                
                JLabel lblName_1 = new JLabel("Credit Card Number :");
		lblName_1.setBounds(35, 131, 200, 14);
		contentPane.add(lblName_1);
                t1 = new JTextField();
		t1.setBounds(271, 131, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
                
                
                JLabel lblName_2 = new JLabel("Expiry Date: (yyyy-mm)");
                
		lblName_2.setBounds(35, 161, 200, 14);
		contentPane.add(lblName_2);
                t2 = new JTextField();
                t2.setBounds(271, 161, 150, 20);
                contentPane.add(t2);
		t2.setColumns(10);
                
//		//add(new JLabel("Birthday: "));
//		
////		UtilDateModel model = new UtilDateModel();
////		model.setDate(1990, 8, 24);
////		model.setSelected(true);
////		
////               Properties p = new Properties();
////                p.put("text.today", "Today");
////                p.put("text.month", "Month");
////                p.put("text.year", "Year");
////                JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
////// Don't know about the formatter, but there it is...
////// datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
////		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
////		
////		contentPane.add(datePicker);
////		                
//                
//        JPanel panel = new JPanel();
//
//        JXDatePicker picker = new JXDatePicker();
//        picker.setDate(Calendar.getInstance().getTime());
//        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
//
//        panel.add(picker);
//        getContentPane().add(panel);

                JLabel lblName_3 = new JLabel("CVV:");
		lblName_3.setBounds(35, 191, 200, 14);
		contentPane.add(lblName_3);
		t3 = new JPasswordField();
		t3.setBounds(271, 191, 150, 20);
		contentPane.add(t3);
		t3.setColumns(10);
                
                JLabel lblName_4 = new JLabel("CardHolder Name:");
		lblName_4.setBounds(35, 221, 200, 14);
		contentPane.add(lblName_4);
		t4 = new JTextField();
		t4.setBounds(271, 221, 150, 20);
		contentPane.add(t4);
		t4.setColumns(10);
                
                JLabel lblName_5 = new JLabel("Address:");
		lblName_5.setBounds(35, 261, 200, 14);
		contentPane.add(lblName_5);
		t5 = new JTextField();
		t5.setBounds(271, 261, 150, 20);
		contentPane.add(t5);
		t5.setColumns(10);
                
                JLabel lblName_6 = new JLabel("City:");
		lblName_6.setBounds(35, 291, 200, 14);
		contentPane.add(lblName_6);
		t6 = new JTextField();
		t6.setBounds(271, 291, 150, 20);
		contentPane.add(t6);
		t6.setColumns(10);
                
                JLabel lblName_7 = new JLabel("Zip Code:");
		lblName_7.setBounds(35, 321, 200, 14);
		contentPane.add(lblName_7);
		t7 = new JTextField();
		t7.setBounds(271, 321, 150, 20);
		contentPane.add(t7);
		t7.setColumns(10);
                
                JLabel lblName_8 = new JLabel("Country:");
		lblName_8.setBounds(35, 351, 200, 14);
		contentPane.add(lblName_8);
		t8 = new JTextField();
		t8.setBounds(271, 351, 150, 20);
		contentPane.add(t8);
		t8.setColumns(10);
                
                
                /*********************************************************************/
		
		
		
                /*****************Payment confirmation Dialogue box**********************/
		JButton btnSearch = new JButton("Pay");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            conn c = new conn();
                            String s00 = (String)comboBox.getSelectedItem();
                            String s0 = t0.getText();
                            String s1 =  t1.getText();
                            String s2 =  t2.getText();
                            String s3 = t3.getText();
                            String s4 =  t4.getText();
                            String s5 =  t5.getText();
                            String s6 =  t6.getText();
                            String s7 =  t7.getText();
                            String s8 =  t8.getText();
                String str = "INSERT INTO pay values( '"+s00+"','"+s0+"','"+s1+"', '"+s2+"', '"+s3+"','"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"')";
              
                            try {
                                c.s.executeUpdate(str);
                            } catch (SQLException ex) {
                                Logger.getLogger(pay.class.getName()).log(Level.SEVERE, null, ex);
                            }

				JFrame frame = new JFrame("Payment Received!");
  
       JOptionPane.showMessageDialog(frame, "Thank you for your Payment","Payment Successful", JOptionPane.PLAIN_MESSAGE);
       frame.setSize(350,350);
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //frame.setVisible(true);
			new UserLogin().setVisible(true);
                                setVisible(false);
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
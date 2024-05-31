///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hotel.management.system;
//
//import java.awt.BorderLayout;
//import java.awt.*;
//
//import java.sql.*;
//import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//import net.proteanit.sql.DbUtils;
//
//import java.awt.Font;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class UserLogin extends JFrame {
//	Connection conn = null;
//	PreparedStatement pst = null;
//	ResultSet rs = null;
//	private JPanel contentPane;
//	private JTextField txt_Type;
//	private JTable table;
//        Choice c1;
//        private JTextField t1,t2,t3,t4,t5,t6,t7,t8;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					UserLogin frame = new UserLogin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	public void close()
//	{
//		this.dispose();
//	}
//
//	/**
//	 * Create the frame.
//	 * @throws SQLException
//	 */
//	public UserLogin() throws SQLException {
//		//conn = Javaconnect.getDBConnection();
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(530, 200, 850, 590);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblSearchForRoom = new JLabel("User Dashboard.");
//		lblSearchForRoom.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblSearchForRoom.setBounds(250, 11, 210, 31);
//		contentPane.add(lblSearchForRoom);
//                
//                
//                /*****************Payment confirmation Dialogue box**********************/
//		JButton btnSearch = new JButton("Pay");
//		btnSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//				pay payment = new pay();
//				payment.setVisible(true);
//                                setVisible(false);
//				}
//				catch (Exception ss){
//					ss.printStackTrace();
//				}
//			}
//		});
//		btnSearch.setBounds(200, 440, 120, 30);
//                btnSearch.setBackground(Color.BLACK);
//                btnSearch.setForeground(Color.WHITE);
//		contentPane.add(btnSearch);
//                /**************************************************************************************/
//		
//                /***********************************Search Room*************************************/
//                JButton btnNewButton = new JButton("Search Room");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				try{
//				Room room = new Room();
//				room.setVisible(true);
//                                setVisible(false);
//				}
//				catch(Exception e){
//					e.printStackTrace();
//				}
//				
//			}
//		});
//		btnNewButton.setBounds(380, 440, 120, 30);
//                btnNewButton.setBackground(Color.BLACK);
//                btnNewButton.setForeground(Color.WHITE);
//                /************************************************************************/
//		JButton btnExit = new JButton("Back");
//		btnExit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				new Reception().setVisible(true);
//                                setVisible(false);
//			}
//		});
//		btnExit.setBounds(560, 440, 120, 30);
//                btnExit.setBackground(Color.BLACK);
//                btnExit.setForeground(Color.WHITE);
//		contentPane.add(btnExit);
//                
//                getContentPane().setBackground(Color.WHITE);
//	}
//}

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

import javax.swing.*;

import java.sql.*;	
import java.awt.event.*;
import java.awt.*;

public class UserLogin extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		new Reception();
	}
	
	public UserLogin(){
		
                setBounds(530, 200, 850, 650);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fourth.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(250,30,500,600);
                add(l1);
		

                
		
		
		/*******************************************Edit User Info*****************************************/
                JButton btneditusrinfo = new JButton("Edit your profile here");
		btneditusrinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				EditProfile editprofile = new EditProfile();
				editprofile.setVisible(true);
                                setVisible(false);
				}
				catch (Exception ss){
					ss.printStackTrace();
				}
			}
		});
		btneditusrinfo.setBounds(10, 150, 200, 30);
                btneditusrinfo.setBackground(Color.BLACK);
                btneditusrinfo.setForeground(Color.WHITE);
                
                contentPane.add(btneditusrinfo);
/*******************************************************************************************/


		
		
	JButton btnSearchRoom = new JButton("Search Room");
		btnSearchRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				SearchRoom search = new SearchRoom();
				search.setVisible(true);
                                setVisible(false);
				}
				catch (Exception ss){
					ss.printStackTrace();
				}
			}
		});
		btnSearchRoom.setBounds(10, 230, 200, 30);
                btnSearchRoom.setBackground(Color.BLACK);
                btnSearchRoom.setForeground(Color.WHITE);
                
                contentPane.add(btnSearchRoom);
                
                
                
                JButton btnSearch = new JButton("Pay");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				pay payment = new pay();
				payment.setVisible(true);
                                setVisible(false);
				}
				catch (Exception ss){
					ss.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(10, 310, 200, 30);
                btnSearch.setBackground(Color.BLACK);
                btnSearch.setForeground(Color.WHITE);
		contentPane.add(btnSearch);
                
                
		
		
		JButton btnNewButton_7 = new JButton("Logout");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                  
                                    
                                    
                                    new Login().setVisible(true);
                                    setVisible(false);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_7.setBounds(10, 550, 200, 30);
                btnNewButton_7.setBackground(Color.BLACK);
                btnNewButton_7.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_7);
                getContentPane().setBackground(Color.WHITE);
                
                setVisible(true);
	}
}
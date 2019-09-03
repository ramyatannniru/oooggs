package com.multichatserver;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.net.*;
import javax.swing.JTextField;


public class ServerChat extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerChat frame = new ServerChat();
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
	public ServerChat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrServerchat = new JTextArea();
		txtrServerchat.setText("serverchat");
		txtrServerchat.setBounds(30, 11, 317, 116);
		contentPane.add(txtrServerchat);
		
		JButton btnGettext = new JButton("gettext");
		btnGettext.setBounds(151, 158, 89, 23);
		contentPane.add(btnGettext);
		
		textField = new JTextField();
		textField.setBounds(261, 146, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		btnGettext.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 int portnumber = 1236;
					      
					        try {
					        // Create a MulticastSocket
					        MulticastSocket serverMulticastSocket =
					                new MulticastSocket(portnumber);
					        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
					         
					        
					        System.out.println("MulticastSocket is created...");
					        
					        // Determine the IP address of a host, given the host name
					        InetAddress group =
					                InetAddress.getByName("225.0.0.1");
					        
					        // getByName- returns IP address of given host
					        serverMulticastSocket.joinGroup(group);
					        chatMulticastSocket.joinGroup(group);
						      
					        System.out.println("joinGroup method is called...");
					        boolean infinite = true;
					        
					        // Continually receives data and prints them 
					        while(infinite) {
					            byte buf[] = new byte[1024];
					            DatagramPacket data =
					                    new DatagramPacket(buf, buf.length);
					            serverMulticastSocket.receive(data);
					            System.out.println("hii");
					            String msg =
					                    new String(data.getData()).trim();
					            System.out.println("the message from the client"+msg);
					            
					        }
					        String msg = textField.getText();
					        
					        
						       
					        
					        // Send the message to Multicast address
					        DatagramPacket data = new
					                DatagramPacket(msg.getBytes(), 0,
					                msg.length(), group, portnumber);
					        chatMulticastSocket.send(data);
					        
					        serverMulticastSocket.close();
						
					}catch(Exception e1)
					        {
						         e1.printStackTrace();
					        }
					}
			
				});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package com.multichatserver;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.net.*;
import java.io.*;

public class ClientChat extends JFrame  implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientChat frame = new ClientChat();
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
	public ClientChat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(53, 11, 296, 70);
		contentPane.add(textArea);
		
		JButton btnEnter = new JButton("enter");
		btnEnter.setBounds(147, 106, 89, 23);
		contentPane.add(btnEnter);
		btnEnter.addActionListener(new ActionListener()
				{
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int portnumber = 1236;
				       
			        try {
			        // Create a MulticastSocket
			        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
			        MulticastSocket serverMulticastSocket =
			                new MulticastSocket(portnumber);
			        // Determine the IP address of a host, given the host name
			        InetAddress group =
			                InetAddress.getByName("225.0.0.1");
			        
			        // Joins a multicast group
			        chatMulticastSocket.joinGroup(group);
			        serverMulticastSocket.joinGroup(group);
			        
			        // Prompt a user to enter a message
			        String msg = textArea.getText();
			        
			        
			       
			        
			        // Send the message to Multicast address
			        DatagramPacket data = new
			                DatagramPacket(msg.getBytes(), 0,
			                msg.length(), group, portnumber);
			        chatMulticastSocket.send(data);
			        
			        // Close the socket
			        boolean infinite = true;
			        
			        // Continually receives data and prints them 
			        while(infinite) {
			            byte buf[] = new byte[1024];
			            DatagramPacket data_1 =
			                    new DatagramPacket(buf, buf.length);
			            serverMulticastSocket.receive(data_1);
			            System.out.println("hii");
			            String msg_1 =
			                    new String(data_1.getData()).trim();
			            System.out.println("the message from the server"+msg_1);
			            
			        }
			        chatMulticastSocket.close();
					
				}catch(Exception e1)
			        {
					   e1.printStackTrace();
					   System.out.println("error");
			        }
				}
				});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

package com.network;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.*;
import java.net.*;

public class MyFrameFactorial extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblFactorial;
	private JButton btnGetfactorial;

	/**
	 * Launch the application.
	 */
	
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrameFactorial frame = new MyFrameFactorial();
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
	public MyFrameFactorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(146, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterNumber = new JLabel("enter number");
		lblEnterNumber.setBounds(48, 14, 46, 14);
		contentPane.add(lblEnterNumber);
		
		JButton btnFactorial = new JButton("factorial");
		btnFactorial.setBounds(129, 78, 89, 23);
		contentPane.add(btnFactorial);
		
		textField_1 = new JTextField();
		textField_1.setBounds(288, 28, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblFactorial = new JLabel("factorial");
		lblFactorial.setBounds(226, 34, 46, 14);
		contentPane.add(lblFactorial);
		
		btnGetfactorial = new JButton("getFactorial");
		btnGetfactorial.setBounds(285, 78, 89, 23);
		contentPane.add(btnGetfactorial);
		btnFactorial.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					
								            	Socket client = null;
			                
			                // Default port number we are going to use
			                int portnumber = 1234;
			              
			                
			                // Create a client socket
			                
			                client = new Socket(InetAddress.getLocalHost(), portnumber);
			                System.out.println("Client socket is created " + client);
			                
			                // Create an output stream of the client socket
			                OutputStream clientOut = client.getOutputStream();
			                PrintWriter pw = new PrintWriter(clientOut, true);
			                
			                // Create an input stream of the client socket
			                InputStream clientIn = client.getInputStream();
			                BufferedReader br = new BufferedReader(new
			                        InputStreamReader(clientIn));
			                
			                // Create BufferedReader for a standard input
			                //BufferedReader stdIn = new BufferedReader(new
			                        //InputStreamReader(System.in));
			                
			                
			                
			                // Read data from standard input device and write it
			                // to the output stream of the client socket.
			                String  msg = textField.getText().toString();
			                pw.println(msg);
			                
			                // Read data from the input stream of the client socket.
			                //System.out.println("Message returned from the server = " + br.readLine());
			                textField_1.setText(br.readLine().toString());
			                pw.close();
			                br.close();
			                client.close();
			                
			                // Stop the operation
			                			            } catch (IOException ie) {
			                System.out.println("I/O error - Start server and turn off Firewall" + ie);
			            }
			        }
					
					
				
				
			
			
		}); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

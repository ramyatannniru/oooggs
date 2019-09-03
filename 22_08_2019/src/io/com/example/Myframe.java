package io.com.example;
import java.io.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Myframe extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myframe frame = new Myframe();
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
	public Myframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("add data");
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("getdata");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				File output=new File("output.txt");
				FileInputStream in=new FileInputStream(textArea.getText());
				  FileOutputStream out=new FileOutputStream(output);
				
				  int c;
				  while((c=in.read())!=-1) {
					  System.out.println(c);
					  out.write(c);
				  }
				  in.close();
				  out.close();
				  
				  
				}catch(Exception e1)
				{
			}
				
			}
		});
		contentPane.add(btnNewButton_1, BorderLayout.EAST);
		btnNewButton_1.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
		
	}

}

package swing.com.example;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Swing extends JFrame  implements ActionListener{

	
    private JLabel label;
    private JTextField textfiled;
    private JButton button;
    public Swing() throws HeadlessException {
		// TODO Auto-generated constructor stub
    	super();
    label =new JLabel();
    label.setText("enter your name");
    textfiled =new JTextField(20);
    button =new JButton();
    button.setText("say hello");
    this.setTitle("my example");
    this.setSize(400,400);
    this.setLayout(new FlowLayout());
    this.add(label);
    this.add(textfiled);
    this.add(button);
    button.addActionListener(this);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
   
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this,"hello"+textfiled.getText().toString());
	}
    
   
}

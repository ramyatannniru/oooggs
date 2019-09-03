package swing.com.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdbc.connection.Employee;

import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import javax.swing.JButton;

public class Sample extends JFrame  implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample frame = new Sample();
				
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
	public Sample() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][]"));
		
		JLabel lblEmployeeName = new JLabel("id");
		contentPane.add(lblEmployeeName, "cell 1 0");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 3 0,growx");
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("firstname");
		contentPane.add(lblFirstName, "cell 1 1");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 3 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("lastname");
		contentPane.add(lblLastName, "cell 1 2");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 3 2,growx");
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("email");
		contentPane.add(lblEmail, "cell 1 3");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 3 3,growx");
		textField_2.setColumns(10);
		
		JButton btnAddEmployee = new JButton("add  employee");
		contentPane.add(btnAddEmployee, "cell 1 5");
		
		JButton btnReset = new JButton("reset");
		contentPane.add(btnReset, "flowx,cell 3 5");
		
		JLabel lblNewLabel = new JLabel("id ");
		contentPane.add(lblNewLabel, "cell 1 6");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 3 6,growx");
		textField_4.setColumns(10);
		
		JButton btnDelete = new JButton("delete");
		contentPane.add(btnDelete, "cell 1 7");
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					EmployeeService service=new EmployeeServiceImpl();
					service.delete(Integer.parseInt(textField_4.getText()));
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
			
		});
		btnReset.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
			}
			
		});
		btnAddEmployee.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				try {
					EmployeeService service=new EmployeeServiceImpl();
				service.createEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText(),textField_3.getText(),textField_2.getText()));
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

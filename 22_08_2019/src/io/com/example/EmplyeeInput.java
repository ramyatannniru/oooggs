package io.com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import jdbc.connection.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmplyeeInput {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader;
		BufferedWriter writer = null;
		int data;
		try {
			reader=new BufferedReader(new FileReader("employeeinput.txt"));
		
			String l=reader.readLine();
			while(l!=null)
			{
				
				String[] sr=l.split(" ");
				Employee emp=new Employee(Integer.parseInt(sr[0]),sr[1],sr[2],sr[3]);
				
				EmployeeService emps=new EmployeeServiceImpl();
				emps.createEmployee(emp);
				l=reader.readLine();
				System.out.println(l);
				
			}
			reader.close();
			
		}
		catch(Exception e)
		{
			System.out.println("file not fount");
		}
	}
	}



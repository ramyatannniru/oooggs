package io.com.example;
import java.io.*;
public class EmpObjectInputoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSerializable emp=new EmployeeSerializable("10","sachin","mumbai");
		System.out.println("employee wite"+emp);
		try {
			FileOutputStream out=new FileOutputStream("employee.out");
			ObjectOutputStream oos=new ObjectOutputStream(out);
			oos.writeObject(emp);
			oos.flush();
			
			
			
		}
    catch(Exception e)
		{
    	System.out.println("problemserializable"+e);
		}
		try {
			FileInputStream tf=new FileInputStream("employee.out");
			ObjectInputStream os=new ObjectInputStream(tf);
			emp=(EmployeeSerializable)(os.readObject());
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		System.out.println("employee is"+emp);
	}

}

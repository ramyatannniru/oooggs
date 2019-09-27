package com.employee.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ibmfsd.EmployeeManipulation.Employee;
public class EmployeeDao implements EmployeeDoa {
	public void createEmployee(int id,String firstname,String lastname,String email)
	{
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();

// create session
Session session = factory.openSession();

try {			
// create 3 student objects
System.out.println("Creating 3 student objects...");
Employee employeee=new Employee(id,"firstname","lastname","email");
session.beginTransaction();
session.getTransaction().begin();
session.persist(employeee);
System.out.println("inserted");
session.getTransaction().commit();
Query q=session.createQuery("from Employee");
@SuppressWarnings("unchecked")
List<Employee> list=q.getResultList();
}
finally {
factory.close();
}
}
}

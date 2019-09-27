package com.ibm.fsd.my_first_maven_demo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Tester {
	public static void main(String args[])
	{
	try
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session=factory.openSession();
		Employee employeee=new Employee(1,"ramya","nithu","tsr@h.com");
		session.getTransaction().begin();
		session.persist(employeee);
		System.out.println("inserted");
		session.getTransaction().commit();
		Query q=session.createQuery("from Employee");
		@SuppressWarnings("unchecked")
		List<Employee> list=q.getResultList();
	}catch(Exception e){
		e.printStackTrace();
		
	}
	}
 
}

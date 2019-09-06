package com_spring_form_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com_spring_form_demo.*;

	
	
	/* private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	/*
	 * public void createConnection() { try { Connection
	 * connection=dataSource.getConnection();
	 * System.out.println(connection.toString()); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	
/*	public void createEmployee(Employee employee)
	{
	try {
		Connection connection=dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("insert into emp(name) values(?)");
		pst.setString(1, employee.getName());
		pst.executeUpdate();
		System.out.println("inseerted..!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} 
	
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	
	
	//private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createStudent(Student student)
	{
		String query="insert into stu( firstName,LastName,country,favoriteLanguage,operatingsystem) values(?,?,?,?,?)";
		Object obj[]= {student.getFirstName(),student.getLastName(),student.getFavoriteLanguage(),student.getCountry(),student.getOperatingsystem()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	


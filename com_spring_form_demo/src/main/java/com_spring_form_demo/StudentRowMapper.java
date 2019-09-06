package com_spring_form_demo;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public final class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student stu=new Student();
		
		stu.setFirstName(rs.getString(1));
		stu.setLastName(rs.getString(2));
		stu.setCountry(rs.getString(3));
		stu.setFavoriteLanguage(rs.getString(4));
		stu.setOperatingsystem(rs.getArray(5));
	
		return stu;
	}

}

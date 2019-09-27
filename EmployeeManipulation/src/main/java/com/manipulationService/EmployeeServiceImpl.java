package com.manipulationService;
import com.ibmfsd.EmployeeManipulation.Employee;

import com.employee.dao.*;

import java.sql.SQLException;

import com.employee.dao.*;
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao dao=null;
    public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDao();
	}
	@Override
	public void createEmployee(int id, String firstname, String lastname, String email) {
		// TODO Auto-generated method stub
		dao.createEmployee(id, firstname, lastname, email);
	}

}

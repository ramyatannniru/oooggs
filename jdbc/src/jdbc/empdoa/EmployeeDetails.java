package jdbc.empdoa;


import java.util.List;

import  jdbc.connection.Employee;

public interface EmployeeDetails {
	
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public List<Employee> update(int id, String fname);
  public void delete(int id);
}

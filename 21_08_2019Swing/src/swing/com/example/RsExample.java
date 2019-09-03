package swing.com.example;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import jdbc.connection.MyConnectionFactory;

public class RsExample  {
private MyConnectionFactory factory;
private Connection connection;
public RsExample() throws SQLException
{
	factory=MyConnectionFactory.createObject();
	connection=factory.getConnection();
	
}
public ResultSet getAllEmployee() throws SQLException
{

	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select Id as id,FirstName as firstname,LastName as lastname,Email as email from employee");
	return rs;
}

}

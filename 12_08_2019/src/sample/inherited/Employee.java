package sample.inherited;

public class Employee {
	private String fName;
	private String lName;
	private int empId;
	public Employee() {
		super();
		System.out.println("constructed created");
		
	}
	public Employee(String fName ,String lName ,int empId)
	{
		this.empId=empId;
		this.fName=fName;
		this.lName=lName;
	}
	
     protected String getDetails()
     {
    	 return empId+""+fName+""+lName;
     }
}

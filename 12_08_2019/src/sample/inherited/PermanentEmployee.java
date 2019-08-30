package sample.inherited;

public class PermanentEmployee  extends Employee{
	private  String salary;
	public PermanentEmployee() {
		System.out.println("permenant created");
	}
    public PermanentEmployee(String salary)
    {
    	super("ramya","tanniru",56);
    	this.salary=salary;
    	
    	
    }
    
  @Override
    protected String getDetails(){
    	 return super.getDetails()+salary;
    
    	
    }
}

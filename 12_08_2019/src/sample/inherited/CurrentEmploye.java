package sample.inherited;

public class CurrentEmploye extends Employee{
	private  String ratesalary;
	public CurrentEmploye() {
		super();
		System.out.println("permenant created");
	}
    public CurrentEmploye(String ratesalary)
    {
    	super("ramya","tanniru",67);
    	this.ratesalary=ratesalary;
    	
    	
    }
    
  @Override
    protected String getDetails(){
    	 return super.getDetails()+ratesalary;
    
    	
    }

}

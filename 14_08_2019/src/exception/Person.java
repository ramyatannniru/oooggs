package exception;
import java.io.*;

public class Person  implements Serializable{
	
	public String fname;
	public String lname;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
  public void setFname(String fname) {
	  this.fname=fname;
	  
  }
  public String getName() {
	  return fname;
	 
	  
  }
  public void setlname(String lname) {
	  this.lname=lname;
	  
  }
  public String getlName() {
	  return lname;
	 
  }
  
	
      @Override
public String toString() {
	return "Person [fname=" + fname + ", lname=" + lname + "]";
}
	public Person check()  throws PersonNameNotFoundException{
    	  
    	  
    	  char l=lname.charAt(0);
    	  char f=fname.charAt(0);
    	
    	  
    		  if(Character.isUpperCase(l)==true &&Character.isUpperCase(f)==true) {
    			  System.out.println("correct");
    			  System.out.println(this.toString());
    			  
    	  }
    		  else {
    			  throw new PersonNameNotFoundException("invalid");
    			  
    		  }
			return new Person(lname,fname);
      }
	
}

package enumident;
import  static java.lang.System.out;
import  static java.lang.System.err;
import java.util.*;


public class Tester {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String name=null;
	try {
		out.print("coach name:");
		name=sc.next();
		Tennis ts=new Tennis();
		ts.createCoach(name, Level.MEDIUM);
		out.println(ts.getcoachDetails().toString());
		
		
		
	}
	catch(InputMismatchException e){
		e.printStackTrace();
		err.println(e.toString());
		
	}
	
	

	
	
	}
}

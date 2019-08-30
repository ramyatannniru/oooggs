package exception;

public class Test {
	public static void main(String args[]) {
	
		Person p=new Person("ramya","Nithu");
		try {
			p.check();
			System.out.println("ok");
		}
		catch(PersonNameNotFoundException e){
			System.out.println(e.getmessage());
			
			
		}
		finally{
System.out.println("done");}
		
	}

}

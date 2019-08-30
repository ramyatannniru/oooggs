
package sample.inherited;
public class Tester{
	public static void main(String args[]) {
		PermanentEmployee e=new PermanentEmployee("57");
		CurrentEmploye e1=new CurrentEmploye("8768");
		System.out.println(e1.getDetails());
		System.out.println(e.getDetails());
		
		
	}

}

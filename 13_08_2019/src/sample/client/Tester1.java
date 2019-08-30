package sample.client;
import implement.java.*;

public class Tester1 {
   public static  void main(String args[]) {
	   Model model=new Liner(121,898);
	   Model model1=new Liner(20,78);
		System.out.println(model.isGreaterThan(model, model1));
		System.out.println(model.isLessThan(model, model1));
	   
   }
}

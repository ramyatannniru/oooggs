package sample.client;
import sample.prroduct.*;
public class Test2 {
 public static void main(String args[]) {
	 Product p=new Book("hj",89);
			 System.out.println(Product.getCount());
			 System.out.println(p.getDetails());
 }
}

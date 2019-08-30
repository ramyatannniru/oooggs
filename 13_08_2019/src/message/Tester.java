package message;

public class Tester {
       public static void main (String args[])
       {
    	   Messaging m1= Messaging.createMessageObject();
    	   System.out.println(m1);
    	   Messaging m2=Messaging.createMessageObject("abc");
    	   System.out.println(m2);
       }
       
       
       
       
       
}

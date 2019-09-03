package io.com.example;

public class EncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a0,a1,a2;
      if(args.length!=3)
      {
    	  a0="word.txt";
    	  a1="output.txt";
    	  a2="2";
    	  
      }
      else
      {
    	  a0=args[0];
    	  a1=args[1];
    	  a2=args[2];
      }
      Sampleencryption ec=new Sampleencryption();
      ec.encrypt(a0,a1,Integer.parseInt(a2));
      System.out.println("displaying");
      ec.ViewFileContent(a1);
    		  
	}

}

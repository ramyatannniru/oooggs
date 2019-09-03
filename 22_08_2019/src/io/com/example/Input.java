package io.com.example;
import java.io.*;

public class Input {
  public static void main(String args[]) throws IOException {
	  File inputFile=new File("input.txt");
	   File output=new File("output.txt");
	  FileInputStream in=new FileInputStream(inputFile);
	  FileOutputStream out=new FileOutputStream(output);
	  int c;
	  while((c=in.read())!=-1) {
		  System.out.println(c);
		  out.write(c);
	  }
  
  System.out.println("input stream file added");
  in.close();
  out.close();
  }
}
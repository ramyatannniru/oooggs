package io.com.example;
import java.io.*;

public class Character {
  public static void main(String args[]) throws IOException {
	  File inputFile=new File("input.txt");
	   File output=new File("output.txt");
	  FileReader in=new FileReader(inputFile);
	  FileWriter out=new FileWriter(output);
	  String l;
	  BufferedReader inputstream=new BufferedReader(in);
	  PrintWriter outstream=new PrintWriter(out);
	  
	  while((l=inputstream.readLine())!=null) {
		  System.out.println(l);
		  outstream.println(l);
	  }
  
  System.out.println("input stream file added");
  in.close();
  out.close();
  }
}
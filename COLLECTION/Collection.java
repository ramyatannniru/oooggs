package COLLECTION;
import java.util.*;
import java.util.Scanner;
public class Collection {
	
private String str[];
private Set<String> set;
public Collection() throws InputMismatchException{
	Scanner scanner=new Scanner(System.in);
	System.out.println("number of elements ii array:");
	str=new String[scanner.nextInt()];
	for(int i=0;i<str.length;i++) {
	   System.out.println("name:");
	   str[i]=scanner.next().toString().toLowerCase();
		
	}
	set=new HashSet();
	for(String s:str) {
		if(!set.add(s))
		{
			System.out.println("duplicate elements found");
		}
	}
}
public void display() {
	for(String s:set) {
		System.out.println(toString());
	}
}

}

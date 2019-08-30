package implement.java;
import java.util.*;

public class StackSearch {

   private int arr[];
   private int top;
   private int  maxSize;
   public StackSearch(int size) {
	   arr=new int[size];
	   top=-1;
	   maxSize=size;
   }
   public void push(int x) {
	   if(top==maxSize-1)
	   {
		   System.out.println("overFlow");
	   }
   
   
   else {
	   arr[++top]=x;
   }
   }
   public void pop() {
	   if(top==-1) {
		   System.out.println("underflow");
		   System.exit(0);
		   
	   }
	   else {
		   arr[top--]=arr[top];
	   }
   }
   public int size() {
	   return top+1;
	   
   }
   public void show()
   {
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
   }
   public static void main(String args[]) {
	   StackSearch stack=new StackSearch(7);
	   
	   stack.push(87);
	  
	   stack.push(7);
	   stack.push(9);
	   stack.push(78);
	  
	   stack.show();
	  
   }
}

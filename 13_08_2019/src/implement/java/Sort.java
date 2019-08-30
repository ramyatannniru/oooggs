package implement.java;
import java.util.*;


public class Sort {
	
	
	public static void main (String args[]) {
		int arr[]= {
				100,-20,30,0
		};
		int[] brr=new int[10];
	
	Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			brr[i]=arr[i];
			
			}
		int i=Arrays.binarySearch(brr, 2);
		if(i>0)
		{
			System.out.println("exists");
			
		}
		else {
			System.out.println("not exists");
		}
	}
     
}

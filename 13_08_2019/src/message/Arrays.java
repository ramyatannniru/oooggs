package message;

public class Arrays {
 public char arr[];
 public Arrays() {
	 
 }
 public void createarray(int length)
 {
	 arr=new char[length];
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=(char)('A'+i);
	 }
 }
 public char[] getArray() {
	 
	return arr;
 }


 }

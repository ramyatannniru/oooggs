package sample1;

public class Equals { 
private int a;
private int b;
public Equals(int a,int b) {
	this.a=a;
	this.b=b;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	Equals a=(Equals)obj;
	// TODO Auto-generated method stub
	return super.equals(a);
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
public static void main(String args[]) {
	Equals e1=new Equals(38,20);
	Equals e2=new Equals(10,20);
	System.out.println(e1.equals(e2));
	System.out.println(e2.equals(e2));
}

}

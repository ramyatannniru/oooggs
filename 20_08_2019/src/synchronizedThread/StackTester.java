package synchronizedThread;

public class StackTester {
 private final static MyStack myStack =new MyStack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackProducer sp=new StackProducer(myStack);
		StackConsumer sc=new StackConsumer(myStack);
		Thread t1=new Thread(sp);
		Thread t2=new Thread(sc);
		t1.start();
		t2.start();
		
        
	}

}

package synchronizedThread;

public class StackProducer implements Runnable {
	
	private MyStack myStack;

	public StackProducer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	@Override
	public void run() {
		for(int i=0;i<26;i++)
		{
			try {
				myStack.push((char) ((char)i+97));
				System.out.print("\t"+(char) ((char)i+97));
				System.out.println(" \t pushed");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

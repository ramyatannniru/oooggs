package thread.example;

public class Mythread2 implements Runnable {
	public static void main(String args[])
	{
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<20;j++)
		{
			System.out.println(" thread j is+==+"+j);
			if(j==10)
			{
				try {
					Thread.sleep(4562);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}

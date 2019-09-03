package thread.example;
import java.lang.*;

public class MyThread implements Runnable {
	public static void main(String args[])
	{
		MyThread mt=new MyThread();
		Mythread2 mt1=new Mythread2();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt1);
		Thread t3=new Thread(mt);
		Thread t4=new Thread(mt1);
		Thread t5=new Thread(mt);
		t1.start();
		System.out.println(t1.isAlive());
		t5.start();
		t3.start();
		t2.start();
        
		t4.start();
		
		try {
			t1.join();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(t2.isAlive());
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		for(int i=0;i<20;i++)
		{
			System.out.println(" my first =====>"+i);
			if(i==10)
			{
				Thread.sleep(456);
				System.out.println("its is stoped ");
			}
		}
		}
		catch(Exception e){
			
			
		}
	}

}

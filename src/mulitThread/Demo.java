package mulitThread;

public class Demo extends Thread //implements Runnable 
{
	volatile int num;

	public Demo() {
		num = 1;
	}

	synchronized void printNum()
	{
		for (int i = 0; i < 10; i++) 
		{
			//synchronized(this)
			//{
			System.out.println("Num : "+num+" Thread : "+Thread.currentThread().getName());
			num++;
			//}
			if(i == 4 && Thread.currentThread().getName().equals("ONE"))
			{
				try {
					//Thread.sleep(500);
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		notify();
	}
	@Override
	public void run() {
		System.out.println("Thread is Running...");
		printNum();
		System.out.println("Thread is Dead...");
	}

	public static void main(String[] args) 
	{
		Demo target = new Demo();
		Thread t1 = new Thread(target,"ONE");
		System.out.println("Thread one is Born...");
		t1.start();
		System.out.println("Thread one is ready...");

		Thread t2 = new Thread(target,"TWO");
		System.out.println("Thread TWO is Born...");
		t2.start();
		System.out.println("Thread TWO is ready...");
	}



}

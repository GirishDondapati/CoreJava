package com.girish.mulithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/*public class VoletileTesting 
{
	public static void main(String[] args) throws InterruptedException  
	{
		TestEx obj = new TestEx();
		obj.start();
		 Thread.sleep(1000);
		 obj.stateCheck = false;
		 System.out.println("StateCheck setted as false Main ended");

	}
}
class TestEx extends Thread
{
	volatile boolean stateCheck = true;
	public void run()
	{
		int i = 1;
		System.out.println("Run started");
		while(stateCheck)
		{
			i++;
			System.out.println("---");
		}
		System.out.println(i);
		System.out.println("Run ended");
	}
}*/

class SingletonTest {
	private volatile static SingletonTest singleton;
	private SingletonTest() {
	}
	public static SingletonTest getInstance() {
		if (singleton == null) {
			// To make thread safe
			synchronized (SingletonTest.class) {
				// check again as multiple threads can reach above step
				if (singleton == null)
					singleton = new SingletonTest();
			}
		}
		return singleton;
	}
}
public class VoletileTesting {

	public static void main(String[] args) {
		ExecutorService executorService = null;
		try {
			 executorService = Executors.newFixedThreadPool(5);
			 
			 Runnable t1 = new Runnable() {
				
				@Override
				public void run() {
					for (int i = 1; i <=100; i++) {
						SingletonTest singleton = SingletonTest.getInstance();
						System.out.println(singleton.hashCode());
					}					
				}
			};
			
			Runnable t2 = new Runnable() {
				
				@Override
				public void run() {
					for (int i = 1; i <=100; i++) {
						SingletonTest singleton = SingletonTest.getInstance();
						System.out.println(singleton.hashCode());
					}					
				}
			};
			
			Runnable t3 = new Runnable() {
				
				@Override
				public void run() {
					for (int i = 1; i <=100; i++) {
						SingletonTest singleton = SingletonTest.getInstance();
						System.out.println(singleton.hashCode());
					}					
				}
			};
			executorService.submit(t1);
			executorService.submit(t2);
			executorService.submit(t3);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(executorService != null)
				executorService.shutdown();
		}
	}

}


package com.girish.mulithread;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread1 "+i);
		}
	}
	
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread2 "+i);
		}
	}
	
}
class Thread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread3 "+i);
		}
	}
	
}
public class MultipulThreadControl {

	
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		Thread1 t3=new Thread1();
		t1.start();
		try {
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t2.start();
		//t3.start();

	}

}

package com.girish.mulithread;

public class PriorityEx extends Thread
{	
	public void run()
	{
		System.out.println("current thread name is:" +Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		//System.out.println("Current thread priority is:" +Thread.currentThread().getPriority());
	}
	public static void main(String[] args)
	{
		PriorityEx pe=new PriorityEx();
		PriorityEx pe1=new PriorityEx();
		PriorityEx pe2=new PriorityEx();
		pe1.setPriority(Thread.MIN_PRIORITY);
		pe2.setPriority(Thread.MAX_PRIORITY);
		pe.start();
		pe1.start();
		pe2.start();

	}

}

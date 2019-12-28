package com.girish.mulithread;

public class DaemonEx extends Thread
{

	public void run()
	{
		System.out.println("Thread name is:"+Thread.currentThread().getName()+" Daemon is:  "+Thread.currentThread().isDaemon());
		
	}
	public static void main(String[] args) 
	{
		DaemonEx de=new DaemonEx();
		DaemonEx de1=new DaemonEx();
		de.setDaemon(true);
		de.start();
		de1.start();
	}

}

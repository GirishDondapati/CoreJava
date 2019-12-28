package com.girish.hcl;

public class SivayaThreadProg1 extends Thread implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public SivayaThreadProg1(String s) {
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		SivayaThreadProg1 s1=new SivayaThreadProg1("A");
		SivayaThreadProg1 s2=new SivayaThreadProg1("B");
		
		s1.start();
		Thread.yield();
		s2.run();
		
	}

}

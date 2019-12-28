package com.girish.mulithread;

public class FinalizationMethod 
{
	/*public static void main(String[] args)
	{
		//String s=new String("durga");
		//s=null;
		//System.gc();
		
		FinalizationMethod t=new FinalizationMethod();
		t=null;
		System.gc();
		System.out.println("end of main");
		

	}
	public void finalize()
	{
		System.out.println("my finalize method");
	}*/

	private static FinalizationMethod s;
	public static void main(String[] args) throws InterruptedException
	{
		FinalizationMethod t=new FinalizationMethod();
		t=null;
		System.gc();
		Thread.sleep(3000);
		
		System.out.println(s.hashCode());
		s=null;
		System.gc();
		Thread.sleep(3000);
		
		System.out.println("end of main");
		

	}
	public void finalize()
	{
		System.out.println("my finalize method");
		s=this;
	}
	
}

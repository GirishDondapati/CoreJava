package com.girish.interviewtest;

public class TekSystemsTreadsSleepQ extends Thread
{
	public void run()
	{	try
	    {
			System.out.println("run start");
			sleep(1000);
			System.out.println("run end");
		} 
	     catch (InterruptedException e)
	     {			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		TekSystemsTreadsSleepQ t=new TekSystemsTreadsSleepQ();
		long startime=System.currentTimeMillis();
		
		t.start();
		System.out.println(System.currentTimeMillis()-startime);


	}

}

package com.girish.mulithread;

public class LaraProgram1 {

     public static void main(String[] args) 
     {
		I obj =new I();
		obj.start();
		for(int i=11;i<20;i++)
		{
			    System.out.println(i);
		}
	}
}
class I extends Thread
{
	public void run()
	{
		int i=10/0;
		System.out.println("end of  child");
		/*for(int i=1;i<10;i++)
		{
			    System.out.println(i);
		}*/
	}

}

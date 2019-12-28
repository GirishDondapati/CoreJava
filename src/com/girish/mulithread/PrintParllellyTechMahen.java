package com.girish.mulithread;
class Test123 extends Thread
{
	public void run()
	{
		System.out.println("run method");
		
		for(int i=0;i<=10;i+=2)
		{
			System.out.println(i);
		}
	}
	
}

public class PrintParllellyTechMahen {

	
	public static void main(String[] args) {
		
		System.out.println("main method");
		for(int j=1;j<=10;j+=2)
		{
			System.out.println(j);
		}
		Test123 t=new Test123();
		t.start();
		
	}

}

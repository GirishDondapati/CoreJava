package com.girish.FinalKeyword;
class Bike
{
	final void run()
	{
		System.out.println("this class bike final run() method");
	}
	
}

public class FinalMethod extends Bike
{	
	/*void run()//can't override final method 
	{
		System.out.println("Finalmetiod class run method");
	}*/ //it will block final method will be invoke
	public static void main(String[] args)
	{
		FinalMethod fm=new FinalMethod();
		fm.run();
		
		

	}

}

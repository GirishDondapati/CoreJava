package com.girish.FinalKeyword;

final class Bike//here final will be remove it can be extends otherwise it shows error
{
	void run()
	{
		System.out.println("this class bike final run() method");
	}
}
public class FinalClass extends Bike
{
	
	public static void main(String[] args) 
	{
		
		FinalClass fc=new FinalClass();
		fc.run();
	}

}

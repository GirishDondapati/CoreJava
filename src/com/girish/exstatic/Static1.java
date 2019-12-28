package com.girish.exstatic;

public class Static1 {

	static
	{
	  int x=10;
	  //we can't write the static variable in any method or any static block its only allows the final 
	  //static int x=10;
		
	}
	
	public void method11()
	{
		int x=10;
	}
	
	public static void main(String[] args)
	{
		int j=9;
		int i=10;
		System.out.println(i);
	}

}

package com.girish.vijay;

public class ABc {

	static void check() throws RuntimeException
	{
		try{
			System.out.println("Checking");
			throw new RuntimeException();
		}
		catch(Exception e){
			System.out.println("RuntimeException");
		}
		
	}
	
	public static void main(String[] args) {
		try{
			check();
		}
		catch(RuntimeException re)
		{
			System.out.println("Exception");
			System.out.println("success");
		}

	}
}

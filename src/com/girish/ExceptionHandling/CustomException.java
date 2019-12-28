package com.girish.ExceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException
{
	public TooYoungException(String str) 
	{
		super(str);
	}
}
class TooOldException extends RuntimeException
{
	public TooOldException(String str) 
	{
		super(str);
		System.out.println("This is customised exception");
	}
}
public class CustomException {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age: ");
		int age=sc.nextInt();
		if(age<18)
		{
			throw new TooYoungException("Please wait some time your age is very less");			
		}
		else if(age>60)
		{
			throw new TooOldException("Your age is very high you are already crass the marrage age");
		}
		else
		{
			System.out.println("you are perfect for marrage");
		}
	}

}

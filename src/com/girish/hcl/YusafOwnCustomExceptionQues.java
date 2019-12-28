package com.girish.hcl;
class OwnExceptionTest extends RuntimeException //1 Exception 2//RuntimeException 3
{
	public OwnExceptionTest() {
		//super();
		//System.out.println("You are not good");
	}
}

public class YusafOwnCustomExceptionQues {

	
	public static void main(String[] args) //throws OwnExceptionTest 
	{
		int age=20;
		if(age>=10)
		{
			try {
				throw new OwnExceptionTest();
				//we can't throw directly it Checked Exceptions
			} catch (Exception e) {
			//Here we can catch That class and super class of that class only 
			//you can catch But we can't use the Exception and RuntimeException
			//in catch black 
				//why means that class extends Throwable so can catch Throwable
				//courrent class only 
				e.printStackTrace();
			}	
			//if we extends Exception in ourown exception class is 2
			//On that we can catch exception by using Throwable, Exception, OurOwnexception class
			//only possible we can't cach that exception by using RuntimeException
		}
		else
		{
			System.out.println("you are so good ");
		}
		

	}

}

package com.girish.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;


class BclassException 
{
	public void method()throws NumberFormatException
	{
		System.out.println("jdjdjj");
	}
	public void method1()throws IOException
	{
		System.out.println("jdjdjj");
	}
}

public class AclassException extends BclassException
{
	public void method()throws ArithmeticException
	{
		System.out.println("jdjdjjhskfks");
	}
	
	public void method1()throws FileNotFoundException
	{
		System.out.println("jdjdjjhskfks");
	}
	public static void main(String[] args) {
		AclassException a=new AclassException();
		a.method();
	}

}
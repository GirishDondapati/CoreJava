package com.girish.FinalKeyword;

import java.io.ObjectInputStream.GetField;

public class FinalVariable {

	int a=10;
	final int b=20;
	final int x;
	final static int y;
	static
	{
		System.out.println("static block");
		y=20;
	}
	public FinalVariable() {
		System.out.println("constructor method");
		x=10;
	}
	void display()
	{
		a=20;
		//b=30;//final variable can't change value
		System.out.println(a+" "+b);
		System.out.println(x+"  "+y);
	}
	public static void main(String[] args)
	{
	    FinalVariable fv=new FinalVariable();
		fv.display();
		
		

	}

}

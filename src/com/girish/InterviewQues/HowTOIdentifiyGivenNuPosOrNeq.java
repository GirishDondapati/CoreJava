package com.girish.InterviewQues;

import java.util.Scanner;

//whether an number is positive or negative. The rules are that , we should not use 
//conditional operators such as <, and >, built in java functions 
//(like substring, indexOf, charAt, and startsWith), no regex, or API's. 
//I did some homework on this and the code is given below, but it only works for integer type.
//But they asked me to write a generic code that works for float, double, and long.
public class HowTOIdentifiyGivenNuPosOrNeq 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter any number");
	double no=sc.nextDouble();
	//Below code is succuess but if customer enter as 4-7 on that time it gives Exception in thread "main" java.util.InputMismatchException
	/*System.out.println((no+"  ").charAt(0));
	int op=(no+"  ").charAt(0);
	if(op=='-'){
		System.out.println("given number is negative");
	}*/
	
	 
	if(no==0)
	{
		System.out.println("given number is Zero");
	}
	else if((no-no)==0)
	{
		System.out.println("given number is possitive");
	}
	else
	{
		System.out.println("given number is negitive");
	}
	
	
}
}

package com.girish.hcl;
/*
 * In my class five constructor there. So i create only one object for myclass 
 * But that five constructor want to execute how we can write code for that
 */
public class RajasekarConstructorQues {

	RajasekarConstructorQues()
	{
		System.out.println("default construct");
	}
	RajasekarConstructorQues(int a)
	{
		this();
		System.out.println("one parameter construct");
	}
	RajasekarConstructorQues(int a,int b)
	{
		
		this(10);
		System.out.println("two parameter construct");
	}
	RajasekarConstructorQues(int a,int b,String str)
	{
		this(10, 10);
		System.out.println("three parameter construct");
	}
	RajasekarConstructorQues(int a,int b,String str,int c)
	{
		this(10, 10, "djj");
		System.out.println("four parameter construct");
	}
	public static void main(String[] args) {
		RajasekarConstructorQues ra=new RajasekarConstructorQues(10,10,"ada",20);

	}

}

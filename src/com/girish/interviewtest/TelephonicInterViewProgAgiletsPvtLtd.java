package com.girish.interviewtest;

class Aaa
{
	int a=10;
	public void print()
	{
		System.out.println("i am inside A");
	}
	public int print1()
	{
		return 10;
	}
}
class Bbb extends Aaa
{
	int a=20;
	public void print()
	{
		System.out.println("I am inside B");
	}
	public int print1()
	{
		return 20;
	}
}
public class TelephonicInterViewProgAgiletsPvtLtd
{

	public static void main(String[] args) 
	{
		Bbb x=new Bbb();
		Aaa y=x;
		x.print();
		y.print();
		System.out.println(x.a);
		System.out.println(y.a);
		int x11=x.print1();
		System.out.println(x11);
		int y11=y.print1();
		System.out.println(y11);
	}

}

package com.girish.interviewtest;

public class ManhattenMethodCall
{

	public void add(int a, int b)
	{
		System.out.println("Int method"+a+b+10);
	} 

	public void add(float a, float b)
	{
		System.out.println("float method "+a+b+11.30);
	} 

	public void add(double a, double b)
	{
		System.out.println("double method "+(a+b+20.90));
	} 



	public static void main(String ar[]){ 

	ManhattenMethodCall a = new ManhattenMethodCall(); 

	a.add(1f,2);

	a.add(1.2,2f);
	//what add methods will be call

	} 
}

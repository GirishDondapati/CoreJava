package com.girish.interviewtest;
//write a java program to add two numbers using two oops concepts...

/*class A1234
{
	public int sum(int x,int y)
	{
		return x+y;
	}
}

public class CTSInterviewEx extends A1234 //1st extending super class 
{
	public int sum(int x,int y)//2nd overriding super class method
	{
		System.out.println("Sum of two numbers is:"+(x+y));
		return x+y;
	}

	public static void main(String[] args)
	{
		CTSInterviewEx c1=new CTSInterviewEx();
		System.out.println(c1.sum(10,10));
		
		A1234 a=new A1234();
		System.out.println(a.sum(10,20));
		

	}

}*/

//using  polymorphism 
class showdemo
{
   /*static int a=10;
   static int b=20;
   
   void show(int x,int y)
   {
       System.out.println(a+b);   
   }
   
   
   void show(double x,int y)
   {
          System.out.println(x+y);
   }*/
	
	  static int x=10;
	  static int y=20;
	   void show(int x,int y)
	   {
	       System.out.println(x+y);   
	   }	   
	   
	   void show(double x,int y)
	   {
	          System.out.println(x+y);
	   }
}


public class CTSInterviewEx extends showdemo
{
   public static void main(String ... args)
   {
	   CTSInterviewEx d=new CTSInterviewEx();
       d.show(50,40);
   }
}

package com.girish.innerclass;
/*
 * started date 26/02/2014
 * Basically inner class means class inside a class called inner class(its coming in Has-a relationship)
 * 
 * its mainly four types inner class
 * 1) Normal (or) regular Inner Class 
 * 2) Method local Inner class
 * 3) Anonymous Inner Class
 * 4) static nested inner class
 */
/*public class NormalInnerClassEx
{
	class Inner
	{
		public void main() 
		{
			System.out.println("Inner class means inner class main method");
		}
		
		
	}
	public void methodinmain()
	{
		System.out.println("outer class method ");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("outer class means main class main method");
		NormalInnerClassEx.Inner i=new NormalInnerClassEx().new Inner();
		i.main();
		//here we can,t called main class method so we must create main class object and 
		//we use as below
		// i e  i.methodinmain(); we can,t call
		NormalInnerClassEx n=new NormalInnerClassEx();
		n.methodinmain();
		NormalInnerClassEx.Inner i1=n.new Inner();
		i1.main();
	}

}*/


//accessing inner class code from Instance area of outer class
/*public class NormalInnerClassEx
{
	class Inner
	{
		public void method1() 
		{
			System.out.println("Inner class means inner class main method");
		}		
	}
	public void method1()
	{
		Inner i=new Inner();
		i.method1();
	}
	

	public static void main(String[] args) 
	{
		System.out.println("outer class means main class main method");
		NormalInnerClassEx n=new NormalInnerClassEx();
		n.method1();
	}

}
*/


//from the Inner class we can access all members of outer class (both static and non static ) directly
public class NormalInnerClassEx
{
	static final int x=10;
	int y=20;
	class Inner
	{
	   int x=30;
	   	public void method1() 
		{
	   		int x=40;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(NormalInnerClassEx.this.x);
			System.out.println(y);
			
		}
	}
	public void methodinmain()
	{
		System.out.println("outer class method ");
	}
	

	public static void main(String[] args) 
	{
		new NormalInnerClassEx().new Inner().method1();
	}
}
	
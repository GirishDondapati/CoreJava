package com.girish.FinalKeyword;

abstract class Test // Here we can't declare final key word
{
	abstract void m1();  // we can,t declare final for abstract method
	
	void m2()  //if u declare a conreate method as final it will direcly call in extended class but we can't ovverride
	{						
		System.out.println("final concreate method");
	}
	
}
 final class Test1 extends Test
{
	final public void m1()
	{
		System.out.println("abstrat class m1 abstract method will be overrided");
	}
	
	public void m2()
	{
		//super.m2();
		System.out.println("concreate method overrided");
	}
}
public class FinalExplanation //extends Test1
{
	/**@author Girish
	 * Stop value changing
	 * Stop method overriding
	 * Stop inheritance
	 * @Final class can't have abstact methods
	 * @final class can't extended
	 * @final variable can't change the value..if declare variable as final we must implement the value
	 * @final class can have a final methods
	 */
	
	static
	{
		
	}
	final int speedlimit=90;//final variable  must and should initialized
	
	
	 public void run(){  
	 //speedlimit=400; //can't change final variable value  
		 System.out.println("This is run method in main class");
	 }  
	 public static void main(String args[]){  
	 Test obj=new Test1();
	 obj.m2();
	 obj.m1();
	// obj.run();
	 }  

}

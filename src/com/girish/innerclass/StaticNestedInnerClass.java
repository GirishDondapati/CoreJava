package com.girish.innerclass;
/*
 * what is diff between static nested class and Inner class
 *  Inner Class:
 *  1) Inner class objects is always associated with outer class object.
 *  	i e. with out existing outer class object we can't get inner class object
 *  2) Inside normal Inner class we can't declare static members
 *  3) Insic=de normal kInner class we can't declare main () and hence it is not possible to invoke inner class directly from command prompt
 *  
 *  Static Nested Inner Class:
 *  1) Static nested class object is not associated with outer class object.
 *  	i e. with out existing outer class object there may be a chance of existing static nested class object
 *  2) Inside static nested class we can declare static members
 *  3) Inside static nested class we can declare main() and hence we can invoke static nested class directly in command prompt
 *   
 */

public class StaticNestedInnerClass 
{
	static class Innerclass
	{
		public void method1()
		{
			System.out.println("static nested inner class object");
		}
	}
	public static void main(String[] args) 
	{
		Innerclass i=new Innerclass();
		i.method1();

	}

}


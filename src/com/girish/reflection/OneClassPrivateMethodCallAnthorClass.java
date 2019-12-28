package com.girish.reflection;

import java.lang.reflect.Method;

class Test1u3
{
	private void method1()
	{
		System.out.println("this is pravate method in Test1u3 class");
	}
}
public class OneClassPrivateMethodCallAnthorClass {

	public static void main(String[] args) throws Exception 
	{
		Class c=Class.forName("Test1u3");
		Object o=c.newInstance();
		Method d=c.getDeclaredMethod("method1", null);
		d.setAccessible(true);
		
		
	}

}

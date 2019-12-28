package com.girish.innerclass;

public class MethodLocalInnerClass
{
	int x=10;
	public void method()
	{
		final int y=20;//method inner class we declare variables as final other wise we get compaile time exception
		class InnerClass
		{
			public void sum(int x,int y)
			{
				System.out.println("Sum is :"+(x+y));
			}
			public void method()
			{
				System.out.println(x+" "+y);
			}
		}
		InnerClass i=new InnerClass();
		i.sum(10, 20);
		i.sum(20, 30);
		i.sum(30, 40);
		i.sum(40, 50);
	}
	public static void main(String[] args)
	{
		new MethodLocalInnerClass().method();
	}

}

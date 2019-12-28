package com.girish.staticex;

public class StaticVariableEx 
{
	static int var=10;
	int var1=20;
	
	public static int method1()
	{
		System.out.println(var);
		return var;
	}
	
	public void method2()
	{
		System.out.println(var+"  " +var1);
	}
	public static void main(String[] args) 
	{
		StaticVariableEx sv=new StaticVariableEx();
		sv.method1();
		sv.method2();
		StaticVariableEx.method1();

	}

}

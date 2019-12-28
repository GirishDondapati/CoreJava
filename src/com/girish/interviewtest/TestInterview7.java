package com.girish.interviewtest;

interface Test 
{
	void show();
}
abstract class Test1
{
	void show1()
	{

	}
	abstract void show3(String a);

}
class TestInterview7 extends Test1 implements Test
{
	
	void show3(String x)
	{
		System.out.println(x);	
		
	}
	public void show()
	{
		
	}
	public static void main(String[] args) 
	{
			TestInterview7 ti=new TestInterview7();
			ti.show3("hhhh");
		//System.out.println("Hello World!");
	}
}

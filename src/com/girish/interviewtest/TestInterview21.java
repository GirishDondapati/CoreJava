package com.girish.interviewtest;

public class TestInterview21 {

	public void test(int x)
	{
		int odd=1;
		if(odd)// compile time error
			System.out.println("odd");
		else
			System.out.println("even");
	}
	public static void main(String[] args)
	{
		TestInterview21 t=new TestInterview21();
		t.test(10);
		
	}

}

package com.girish.interviewtest;

public class TestInterview12 
{
	int x=100;
	public void checkValue()
	{
		
		x+=1;
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		TestInterview12 t=new TestInterview12();
		t.x=5;
		t.checkValue();

	}

}

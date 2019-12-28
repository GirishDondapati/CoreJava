package com.girish.interviewtest;

public class TestInterview25 
{	
	public static int i=10;
	public int j=10;
	public static void main(String[] args) 
	{
		TestInterview25 t=new TestInterview25();
		TestInterview25 t1=new TestInterview25();
		t.i=20;
		t.j=20;
		t1.i=30;
		t1.j=30;
		System.out.println(t.i);
		System.out.println(t.j);
		System.out.println(t1.i);
		System.out.println(t1.j);
		
		
	}

}

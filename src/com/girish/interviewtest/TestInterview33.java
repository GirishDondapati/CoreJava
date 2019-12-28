package com.girish.interviewtest;

public class TestInterview33 {

	/*public TestInterview33() {
		
		 s="jdjjd";
	}*/
	 static String s;
	 
	public void mmm()
	{
		System.out.println(s);// It give NULL
	}

	public static void main(String[] args)
	{
		TestInterview33 ti=new TestInterview33();
		System.out.println(s);//It is also give null
		ti.mmm();
		
	}

}

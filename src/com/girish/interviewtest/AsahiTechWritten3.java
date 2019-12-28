package com.girish.interviewtest;

public class AsahiTechWritten3 {

	private static int val = 1;
	public static void main(String[] args)
	{
		double x = 10;
		System.out.println((int)Math.sqrt(x));
		for (int i = 0; i < 5 ; i++)
		{
			val = val + (int) Math.sqrt(x);
		}
		System.out.println(val);

	}

}

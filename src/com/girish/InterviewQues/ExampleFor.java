package com.girish.InterviewQues;

public class ExampleFor
{
	int y,x,z;
	static int m,n,o=2;
	public static void main(String args[])
	{
		
		ExampleFor exampleFor = new ExampleFor();
		exampleFor.z++;
		System.out.println(exampleFor.z);
		exampleFor.z++;
		/*System.out.println(exampleFor.x);//instant variable
		System.out.println(exampleFor.y);
		System.out.println(exampleFor.z);
		System.out.println(m);//static variable
		System.out.println(n);
		System.out.println(o);*/
		int i1 = 0;
		int i2 = 0;

		i1 = i1++;//post increment
		i2 = ++i2;//pre increment

		System.out.println(i1);
		System.out.println(i2);
	}
	
}

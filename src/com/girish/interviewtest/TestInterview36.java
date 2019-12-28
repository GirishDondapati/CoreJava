package com.girish.interviewtest;
//In the Program below line no 27,29 what wrong in that code and what is difference that two lines
class A12
{
	void print()
	{
		System.out.println("This is a class print method");
	}
}


public class TestInterview36 extends A12
{
	void print()
	{
		System.out.println("Main Class Print Method");
	}

	public static void main(String[] args)
	{
		A12 ao=new TestInterview36();
		ao.print();
		
		A12 ao1=(A12)new TestInterview36();
		ao.print();
		
		//TestInterview36 ao2=new A12();//Type mismatch: cannot convert from A12 to TestInterview36
										//It throws Compile time error 
		TestInterview36 ao3=(TestInterview36)new A12();//It don't show any compile time error 
														//But it shows runtime error ClassCastException 
		ao3.print();
		
	}

}

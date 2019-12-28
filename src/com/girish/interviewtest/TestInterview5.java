package com.girish.interviewtest;

class TestInterview5
{
	public static void main(String[] args) 
	{
		int i=1,j=1;
		try
		{
			i++;//1 after post increment after this complited then its value is 2
			//System.out.println(i);//2
			//System.out.println(i++);
			j--;
			//System.out.println(j--);
			if(i/j >1)
				i++;
			System.out.println(i++);
		}
		catch(ArithmeticException e)
		{
			System.out.println("0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("1");
		}
		catch(Exception e)
		{
			System.out.println("2");
		}
		finally
		{
		System.out.println("3");
		}
	System.out.println("4");
	}
}

package com.girish.interviewtest;

import java.util.Scanner;

public class SubexFindDivisibleNoOfGivenNumber 
{

	public void divisibles()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter the No.");
			int a=sc.nextInt();
			if(a>2)
			{
				for(int i=2;i<a;i++)
				{
					int b=a%i;
					if(b==0)
					{
						System.out.print(i+",");
					}
				}
			}
			else
			{
				System.out.println("please enter Positive and that number must be more than two");
				divisibles();
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	public static void main(String[] args) 
	{
		SubexFindDivisibleNoOfGivenNumber s=new SubexFindDivisibleNoOfGivenNumber();
		s.divisibles();

	}

}

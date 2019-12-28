package com.girish.interviewtest;

import java.util.Scanner;

/*
 * 1 1 1 1 1 1
 * 1 2 2 2 2 1
 * 1 2 3 3 2 1
 * 1 2 3 3 2 1
 * 1 2 2 2 2 1
 * 1 1 1 1 1 1
 * 
 */
public class NumberLogicPrograms 
{	
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Please enter eny one number: ");
		   int pp=sc.nextInt();
		   for(int i=0;i<pp;i++)
		   {
			   for(int j=0;j<pp;j++)
			   {
				   if(i==0 || i== (pp-1) || j==0 || j==(pp-1) )
				   {
					   System.out.print("1  ");					   
				   }
				   else
				   {
					   System.out.print((i+1)+"  ");
				   }
			   }
			   System.out.println();
		   }

	}

}

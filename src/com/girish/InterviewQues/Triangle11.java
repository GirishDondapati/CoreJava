package com.girish.InterviewQues;

public class Triangle11
{
	public static void main(String[] args) 
	{
		//int t=1;
		int i,n=5,j;
		for(i=0;i<=5;i++)
		{
			for(j=i;j<=n-1;j++)
			{				
					System.out.print(" ");
			}
					
			for(int k=1;k<=i;k++)
			{			
						System.out.print(k+" ");
						//t++;
			}
			System.out.println();
		}
		

	}

}

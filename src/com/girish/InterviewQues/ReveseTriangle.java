package com.girish.InterviewQues;

public class ReveseTriangle {

	
	public static void main(String[] args) {
		int i,n=5,j;
		for(i=0;i<=5;i++)
		{
			for(j=n;j<=i+n;j++)
			{				
					System.out.print("*");
			}
			for(int k=i;k<=n;k++)
			{			
						System.out.print(1+" ");
					
			}
			
			for(j=n;j<=i+n;j++)
			{				
					System.out.print("*");
			}		
			
			System.out.println();
		}

	}

}

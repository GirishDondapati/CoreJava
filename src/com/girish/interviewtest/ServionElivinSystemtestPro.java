package com.girish.interviewtest;

/*
 * This prog asked in Servion Global Solutions in System test program?
	1) Print Amicable Number upto 10000?
    If d(a)=b, d(b)=a where  a    is not equal to   b   Then a&b are amicable pair, 
    If same that numbers are not amicable numbers. ex The Proper Dividers of number 220 
    are, 1,2,4,5,10,11,20,22,44,55 and 110;therefore d(a)=284 The proper divisor of 284
    are 1,2,4,71, and 142 therefore d(b)=220 Here a,b values diff so this is amicable number
 */

public class ServionElivinSystemtestPro
{
	public static void main(String[] args) 
	{
		for(int i=2;i<=1230;i++)
		{
			int a=0;
			int b=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					a=a+j;
				}
			}
			
			for(int k=1;k<a;k++)
			{
				if(a%k==0)
				{
					b=b+k;
				}
			}
			if(b==i)
			{
				if(a!=b)
				{
				   System.out.println("Amicable number: "+b+" "+a);
				}
			}
		}

	}

}

package com.girish.interviewtest;

class TestInterview9 
{
	public static void main(String[] args) 
	{
		int i=1,j=10;
		do
		//while(j<5) //(or) while(j>5)
		{
			if(i++>--j)  //if(i++<j--)
			continue;
		}while(j<5);
		System.out.println(i+" "+j);//o/p:2,9
	}
}

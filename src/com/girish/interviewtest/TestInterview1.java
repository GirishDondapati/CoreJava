package com.girish.interviewtest;

public class TestInterview1 
{
	public static void main(String[] args) 
	{
		byte b=1;
		while(++b<1);// we don't use below ; it display O/p infinity times(use ; it display O/p one time)
				System.out.println("bb");
				
				
				
				/*int count=0;
				System.out.println(++b>1);
				while(++b>1)//Byte size is 125 so 'bb' prints 125 times
						{System.out.println("bb");
						count++;
						}
				System.out.println(count);*/
	}
}

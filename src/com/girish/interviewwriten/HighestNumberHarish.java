package com.girish.interviewwriten;
import java.util.Scanner;


public class HighestNumberHarish {

	int sum=0;
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		Integer x=s.nextInt();
		int q=length(x);
		   String str="";
		
		String h="";
		for(int i=q;i>=1;i--)
		{
			
			if(i==1)
			{
				h=x.toString();
				}
			
			else{
		     Integer a=x%10;
		  str=str+a.toString();
		     
		     x=x/10;
		}
		}
		
		h=h+str;
	System.out.println(h);
		
	}
	
	public static int length(Integer x)
	
	{
       
		String p=x.toString();
		
	return p.length();
		
	}
}

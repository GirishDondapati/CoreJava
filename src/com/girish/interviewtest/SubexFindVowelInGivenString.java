package com.girish.interviewtest;

import java.util.Scanner;

public class SubexFindVowelInGivenString 
{
	public static void main(String[] args) 
	{
		try
		{
			//This program not completed 1)if give space after word can't read
			//and if we give the capital letters it not displaying 
			Scanner br=new Scanner(System.in);
			System.out.println("Please Enter the String:");
			String s=br.next();
			StringBuffer sb=new StringBuffer(s.toUpperCase());
			
			for(int i=0;i<sb.length();i++)
			{
				char c=sb.charAt(i);
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					System.out.print(c+",");
	
				}
	
			}
	
		}
		catch(Exception e)
		{
			
		}
	}
	
}

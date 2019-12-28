package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.Scanner;

public class KarthikInterviewStringProgram 
{
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please enter no of strings count: ");
		int no = sc.nextInt();
		ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();
		for (int i=0 ; i < no ; i++)
		{
			System.out.print("Please enter String "+(i+1)+": ");
			String str = sc.next();
			StringBuffer sb = new StringBuffer();
			for (int j = str.trim().length()-1; j>=0;j--)
				 .append(str.charAt(j));
			al.add(sb);	
		}
		for(int i = 0; i<al.size() ;i++)
		{
			System.out.println(al.get(i));
		}
	}
	
	
	
	/*public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter no of strings count: ");
		int no = sc.nextInt();
		ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();
		for (int i=0 ; i < no ; i++)
		{
			System.out.print("Please enter String "+(i+1)+": ");
			StringBuffer sb = new StringBuffer(sc.next());
			sb = sb.reverse();
			al.add(sb);	
		}
		for(int i = 0; i<al.size() ;i++)
		{
			System.out.println(al.get(i));
		}
	}*/
}

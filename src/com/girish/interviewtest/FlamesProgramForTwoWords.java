package com.girish.interviewtest;

import java.util.Scanner;

public class FlamesProgramForTwoWords 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter Gen name: ");
		String genName1 = sc.next().trim().toLowerCase();
		StringBuffer genName = new StringBuffer(genName1);
		System.out.println("Please enter Lady name: ");
		String ladyName1 = sc.next().trim().toLowerCase();
		StringBuffer ladyName = new StringBuffer(ladyName1);
		
		int len1 =genName.length();
		int len2 = ladyName.length();
		
		for(int i=0 ; i < len1 ; i++)
		{
			char c = genName.charAt(i);
			for(int j = 0; j < len2 ; j++)
			{
				char d = ladyName.charAt(j);
				if(c == d)
				{
					genName.deleteCharAt(i);
					ladyName.deleteCharAt(j);
					i = 0;
					j = 0;
					break;
				}
			}
		}
		int len = len1+len2;
		StringBuffer sb1 = new StringBuffer("flames");
		int k = -1;
		
		for (int i = 1; i < sb1.length(); )
		{
			for (int j=1;j <= len ; j++)
			{
				++k;
				if(k >= sb1.length())
					k = 0;
				if(j == len)
				{
					sb1.deleteCharAt(k);
					k = k-1;
				}
			}
		}
		char result = sb1.charAt(0);
		
		switch (result) 
		{
			case 'f':
				System.out.println("You Both are friends");
				break;
			case 'l':
				System.out.println("You Both are Lovers");
				break;
			case 'a':
				System.out.println("You Both are afection");
				break;
			case 'e':
				System.out.println("You Both are enimy");
				break;
			case 'm':
				System.out.println("You Both get marrege");
				break;
			case 's':
				System.out.println("You Both are brother and sister");
				break;
	
			default:
				break;
		}
		
		
		

	}

}


/*System.out.println(genName+"  " +ladyName);

if(ladyName.length() != 0 && genName.length()!= 0)
{
	int size = genName.length();
	for (int i = 0; i < size; i+=2) 
	{
		char ch = genName.charAt(i);
		int size2 = ladyName.length();
		for (int j =0; j<size2;j++)
		{
			char ch1 = ladyName.charAt(j);
			if(ch == ch1)
			{
				ladyName.deleteCharAt(j);
				genName.deleteCharAt(i);
				i = 0;
				break;
			}	
		}
	}
	genName.append(ladyName);
	int totSize = genName.length();
	StringBuffer flames = new StringBuffer("flames");
	for (int i =0 ; i < totSize ;i++)
	{
		
	}
	
}*/
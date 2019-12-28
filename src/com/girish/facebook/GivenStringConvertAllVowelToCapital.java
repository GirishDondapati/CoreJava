package com.girish.facebook;

import java.util.Scanner;

public class GivenStringConvertAllVowelToCapital 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str="Hello U are Great in java programming";
		//StringBuffer sb=new StringBuffer(str);
		int l=str.length();
		for(int i=0;i<l;i++)
		{
		char c=str.charAt(i);
		if ("aeiouAEIOU".indexOf(c) != -1) 
		{
			System.out.print(Character.toUpperCase(c));
		}
		else
		{
			System.out.print(c);
		}
		}
		
	}
	
	/*public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String temp=s.nextLine();
		for(int i = 0; i < temp.length(); i++)
		{
		if(temp.charAt(i) == 'a' || temp.charAt(i) == 'A' ||
		temp.charAt(i) == 'e' || temp.charAt(i) == 'E' ||
		temp.charAt(i) == 'i' || temp.charAt(i) == 'I' ||
		temp.charAt(i) == 'o' || temp.charAt(i) == 'O' ||
		temp.charAt(i) == 'u' || temp.charAt(i) == 'U')
		{
			System.out.print(Character.toUpperCase(temp.charAt(i)));
		}
		else{
			System.out.print(temp.charAt(i));
		} 
		} 
	}//Successfully executed 
	*/
	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String s1 = sc.next();
	//String s1="hi how are you";
	s1=s1.replace('a', 'A');
	s1 =s1.replace('e', 'E');
	s1 =s1.replace('i', 'I');
	s1 =s1.replace('o', 'O');
	s1 =s1.replace('u', 'U');
	System.out.println(s1);
	}// actually , this program working properly if i will take the 
	//input directly as a string but when i am trying to take input from 
	//scanner it showing problem.
*/
}

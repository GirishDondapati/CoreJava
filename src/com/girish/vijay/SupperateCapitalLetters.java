package com.girish.vijay;

import java.util.ArrayList;
import java.util.List;

public class SupperateCapitalLetters {

	public static void main(String[] args) 
	{
		String str="AAAbbCCCdd";
		List<String> al1=new ArrayList<String>();
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				sb1.append(str.charAt(i));
			}
			else
			{
				sb2.append(str.charAt(i));
			}
		}
		System.out.println("Capital Letters in given string are: "+sb1);
		System.out.println("Smal letters in given string are: "+sb2);

	}

}

package com.girish.interviewtest;

import java.util.Locale;

public class HexawareSystemTest1
{
	public static void main(String[] args)
	{
		Locale locale2 = new Locale("FRe", "canada");
		System.out.println("locale2: "+locale2.getLanguage());
		System.out.println("locale2: "+locale2.getCountry());
		System.out.println("locale2: "+locale2);
		
		/*int a[] = {0,1};
		a[2] = a[0] +a[1];
		System.out.println(a[2]);*/
	}
}

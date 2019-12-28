package com.girish.interviewtest;

public class AsahiTechWritten1
{
	private static String global = "HELLO";
	
	public static void main(String[] args)
	{
		String s1 = "HELLO";
		String s2 = new String("HELLO");
		String s3 = "H" + "ELLO";
		String s4 = "HE";
		String s5 = "LLO";
		String s6 = s4 + s5;
		System.out.println(System.identityHashCode(global));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s6));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s6);
		System.out.println(s1 == global);
	}
}

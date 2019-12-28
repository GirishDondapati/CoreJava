package com.girish.interviewwriten;

public class UsingStringClass implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		String s = new String("Hai Girish");
		String s1 = "Hai Girish 1";
		// String s2=new String("Hai Girish");
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.contains("Hai"));
		System.out.println(s.equals("Hai Girish"));
		System.out.println(s.toUpperCase());
		System.out.println(s.isEmpty());
		System.out.println(s.concat(s1));
		System.out.println(s.substring(4));
		System.out.println(s.compareTo(s1));
		System.out.println(s.substring(3, 5));

	}
}

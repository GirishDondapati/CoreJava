package com.girish.interviewtest;

public class StringInfo {
	public static void main(String[] args) {
		String S="Aabd12";
		System.out.println(S.length());
		System.out.println(S.codePointAt(3));
		System.out.println(S.codePointBefore(3));
		System.out.println(S.codePointCount(2, 6));
		System.out.println(S.offsetByCodePoints(0, 4));
	}
}

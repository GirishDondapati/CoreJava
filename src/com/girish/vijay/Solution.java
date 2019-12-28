package com.girish.vijay;

import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		String str1 = "ABC";
		String str2 = "BC";
		ArrayList al = new ArrayList();

		for (int i = 0; i < str1.length(); i++) {
			al.add(str1.charAt(i));
		}
		for (int j = 0; j < str2.length(); j++) {
			if (al.contains(str2.charAt(j))) {
				al.remove(str2.charAt(j));
			} else
				System.out.println();
		}
		System.out.println(al);

		// Output2
		/*
		 * String s1="BC"; String s2="BANGALORE"; ArrayList a1=new ArrayList();
		 * ArrayList a2=new ArrayList(); for(int p=0;p<s1.length();p++) {
		 * a1.add(s1.charAt(p)); } for(int q=0;q<s2.length();q++) {
		 * a2.add(s2.charAt(q)); } Iterator itr=a1.iterator();
		 * while(itr.hasNext()){ char a=(Character) itr.next();
		 * if(a2.contains(a)){ a1.remove(a); a2.remove(a); }
		 * 
		 * } System.out.println(a1); System.out.println(a2);
		 */
	}

}

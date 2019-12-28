package com.girish.Collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("11");
		lhs.add("21");
		lhs.add("31");
		lhs.add("41");
		lhs.add("51");
		lhs.add("11");
		lhs.add("21");
		lhs.add("31");
		lhs.add("22");
		lhs.add("33");
		System.out.println(lhs);
		TreeSet ts=new TreeSet(lhs);
		System.out.println(ts);
		
		
	}

}

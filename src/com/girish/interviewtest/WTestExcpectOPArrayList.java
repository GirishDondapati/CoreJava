package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.List;

public class WTestExcpectOPArrayList {
	public static void main(String[] args) {
		List<String> chars = new ArrayList<String>();
		chars.add("A");
		addSumAdditinalValues(chars);
		System.out.println(chars);
	}

	public static void addSumAdditinalValues(List<String> chars)
	{
		chars = new ArrayList<String>();
		chars.add("B");
		chars.add("C");
		chars.add("D");
		
	}
}

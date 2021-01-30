package com.mouni.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8StreamEx
{
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(20);
		al.add(10);
		al.add(100);
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
		
		al.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		
	}

}

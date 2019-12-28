package com.girish.interviewwriten;

import java.util.Stack;

// manhatten association
public class UsingStackClass 
{

	
	public static void main(String[] args) {
		
		
		Stack<Integer> s=new Stack<Integer>();
		s.add(10);
		s.addElement(40);
		s.add(1, 30);
		//s.addAll(s);
		Stack<Comparable> s1=new Stack<Comparable>();
		s1.add("d");
		s1.add("b");
		s1.push(19);
		//s1.addAll(s);
		System.out.println(s1.pop());
	
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s.contains(10));
		System.out.println(s.capacity());
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
		System.out.println(s.elementAt(1));		
		System.out.println(s1);
		System.out.println(s1.clone());		
		Object o=s1.clone();
		System.out.println(o);
		
		
		
	}
}



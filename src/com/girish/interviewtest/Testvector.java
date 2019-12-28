package com.girish.interviewtest;

import java.util.*;

class Testvector
{
	public static void main(String[] args) 
	{
		ArrayList c=new ArrayList();
		c.add(10);
		c.add(70);
		c.add(50);
		c.add(53);
		c.add(90);
		//Arrays.sort(c);
		System.out.println(c);
		TreeSet t =new TreeSet(c);
		t.add(11);
		t.add(15);
		t.add(18);
	System.out.println(t);
	Arrays.sort(args);
	for(int i=0;i<args.length-1;i++)
		{
		System.out.println(args[i]);
		}
	}
}

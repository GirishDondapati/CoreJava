package com.girish.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPro 
{	
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("giri");
		ll.add("20");
		ll.add("30");
		ll.add(null);
		ll.add(null);

		ll.add("10");
		ll.add("10");
		//ll.add(null);//revese not possible
		//ll.add(null);
		System.out.println(ll);
		for (Object object : ll) 
		{
			System.out.println(object);
		}
		Collections.sort(ll);
		System.out.println(ll);
		for (Object object : ll)
		{
			System.out.println(object);
			
		}
		
		

	}

}

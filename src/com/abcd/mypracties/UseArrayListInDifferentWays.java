package com.abcd.mypracties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseArrayListInDifferentWays 
{
	public static void main(String[] args)
	{		
			List al=new ArrayList(30);
			al.add(10);
			al.add(20);
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				Object x=it.next();
				System.out.println(x);
				//al.add(x);
			}
			System.out.println(al);
			
			al=new LinkedList();
			al.add(1000);
			al.add(2000);
			Iterator it1=al.iterator();
			while(it1.hasNext())
			{
				Object x=it1.next();
				System.out.println(x);
				//al.add(x);
			}
			System.out.println(al);
			al.addAll(al);
			System.out.println(al);
			ArrayList al1=new ArrayList();
			al.add(10);
			
			//al1=new LinkedList<E>();
	}
}

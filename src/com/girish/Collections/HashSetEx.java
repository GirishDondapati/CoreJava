package com.girish.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEx
{
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
		hs.add("girish");
		hs.add("hari");
		hs.add("king");
		hs.add("10");
		hs.add(20);
		hs.add("20");
		hs.add("33");
		hs.add(20.5);
		hs.add("55");
		hs.add(30d);
		hs.add("10");
		
		HashSet hs1=new HashSet();
		hs1.add("201");
		hs1.add("333");
		hs1.add(203.5);
		hs1.add("553");
		hs1.add(305d);
		
		hs.addAll(hs1);
		System.out.println(hs);
		/*Boolean b=hs.contains("101");
		if(b.equals(true))
		{
			System.out.println("given object will be there");
			
		}*/
		
		
		LinkedHashSet lhs1=new LinkedHashSet(hs);
		//System.out.println("LinkedHashSet value from HashSet:"+lhs1);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"   ");
		}
		/*System.out.println();
		ArrayList al=new ArrayList(hs);
		System.out.println(al);
		//Collections.sort(al);
		System.out.println("ArrayList values:"+al);
		TreeSet ts=new TreeSet(al);
		System.out.println("TreeSet values form HashSet:"+ts);*/
		
		
		/*TreeSet ts1=new TreeSet(al);
		System.out.println("TreeSet values from ArraySet:"+ts1);
		LinkedHashSet lhs=new LinkedHashSet(hs);
		System.out.println("LinkedHashSet value from HashSet:"+lhs);
		*/
	}

}

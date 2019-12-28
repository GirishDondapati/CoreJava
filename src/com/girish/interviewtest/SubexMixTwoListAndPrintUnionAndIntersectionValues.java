package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SubexMixTwoListAndPrintUnionAndIntersectionValues 
{
	public static void main(String[] args)
	{
		List l3=new ArrayList();
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(20);
		l2.add(30);
		l2.add(40);
		Iterator<Integer> itr=l2.iterator();
		while (itr.hasNext()) {
			int v=itr.next();
			if(l1.contains(v))
				l3.add(v);
			
		}
		
		Set s=new HashSet();
		s.addAll(l1);
		s.addAll(l2);
		System.out.println("union of two lists are:"+s);
		System.out.println("Insection of two list are:"+l3);
		}
		
		/*public static void main(String args[]) 
		{
	  
		    // Set which stores some Singer
		    Set<String> singers = new HashSet<String>();
		    singers.add("Amitabh Bacchan");
		    singers.add("Shan");
		    singers.add("Medona");
				  
		    // Another Set which stores Actors
		    Set<String> actors = new HashSet<String>();
		    actors.add("Amitabh Bacchan");
		    actors.add("tom cruise");
		    actors.add("SRK");
  
	    // Calculating Intersection of two Set in Java
	    Set<String> intersection = Sets.intersection(actors, singers);
	    System.out.printf("Intersection of two Set %s and %s in Java is %s %n",
	            singers.toString(), actors.toString(), intersection.toString());
	    System.err.println("Number of elements common in two Set : "
	                       + intersection.size());
  
    // Calculating Union of two Set in Java
    Set<String> union = Sets.union(actors, singers);
    System.out.printf("Union of two Set %s and %s in Java is %s %n",
            singers.toString(), actors.toString(), union.toString());
    System.out.println("total number of element in union of two Set is : " + union.size());
		} */                
}

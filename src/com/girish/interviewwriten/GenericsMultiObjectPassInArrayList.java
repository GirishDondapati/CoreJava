package com.girish.interviewwriten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericsMultiObjectPassInArrayList {

	
	public static void main(String[] args) {

		Set<Double> list=new TreeSet<Double>();
		list.add(10d);
		list.add(42.42);
		list.add(76.42);
		list.add(423.12);
		list.add(81.0);
		list.add(22.0);
		
		list.add(10.0);
		list.add(34.5);
		//list.add(null);
		//list.add("i am king");
		//Collections.sort(list);
		Iterator<Double> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println(list.subList(3, 6));
		
		/*for (Object object : list.subList(2, 6)) {
			System.out.println(object);
		}*/
	}

}

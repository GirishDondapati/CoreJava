package com.girish.InterviewQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListForTechMahe implements Comparable 
{	
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		//System.out.println(al);  //It gives only [10, 20, 50]
		al.add(30);
		Iterator<Integer> itr=al.iterator();
		System.out.println(itr);
		Collections.sort(al);
		/*al.add(80);
		al.add(60); */ //We can't add elements after Creating Iterator Interface object 
						//it gives Following Exception java.util.ConcurrentModificationException
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//System.out.println(itr.next().equals(10));//if equals returns true else false
			//System.out.println(itr.next().compareTo(20));//If equals returns 0 else 1
			//System.out.println(itr.next().floatValue());//it retunds 20.0, 30.0  .....
			//al.add(120);//here also not possile same error will be occur
			}
		al.add(70);
		al.add(100);//after compleastion of Iterator feaching add will be accpted but not display above while

	}

	@Override
	public int compareTo(Object o) {
		
		return this.compareTo(o);
	}

	/*@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return ((i1<i2)?-1:(i1>i2?+1:0));
	}
*/
}

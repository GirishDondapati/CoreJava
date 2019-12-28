package com.girish.InterviewQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//finding duplicates in HashMap
public class HashSetIdenDupli
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		//Set al=new HashSet();
		al.add(10);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(16);
		al.add(17);
		al.add(12);
		al.add(13);
		System.out.println(al+" : original array list");
		Set ss=new TreeSet();
		ArrayList a=new ArrayList();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			boolean b=ss.contains(o);
			if(false==b)
				ss.add(o);
			else
				a.add(o);
		}
		System.out.print(a+" :arraylist of duplicats  ");
		System.out.println();
		//Collections.sort(ss);
		System.out.print(ss +" : set of values");
	}
}
/*public class Test1
{
	public static void main(String args[])
	{
		Set ss=new HashSet();
		int i=12;
		boolean b=ss.contains(i);
		ArrayList a=new ArrayList();
		if(false!=b){
		ss.add(i);
		}else{
			a.add(i);
		}
		System.out.println();
	}

}
*/
package com.girish.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import javax.xml.crypto.AlgorithmMethod;
//import java.util.Iterator;

public class ArrayListPro 
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		Enumeration enu = Collections.enumeration(al);
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}
	/*public static void main(String[] args) throws Exception
	{
		//Collection a=new ArrayList();
		//System.out.println();
		ArrayList al=new ArrayList(300);
		//System.out.println(al.listIterator());
		al.add("10");
		al.add("koti0");
		al.add("30");
		al.add("dghdj");
		al.add("null");
		al.add(null);//sorting is not possible why means jvm don't know where put null value at end or start so it give 
					  // runtime exception 
		al.add("20");
		al.add("95");
		//Iterator itr=al.iterator();//it throws cuncarentmodificationException
		//System.out.println(al.size());
		//System.out.println(al);
		for (Object object : al) {
			//itr.remove();//it throws java.lang.IllegalStateException
			System.out.print(object+"\t");
			//al.add(45);//In List and set we can't insert or added the element 
						 //at retrieving time it gives ConcurrentModificationException at run time
			}
		al.add("21");
		//Iterator itr=al.iterator();//it throws cuncarentmodificationException
		System.out.println(al.remove(4));
		Iterator itr=al.iterator();
		//Collections.sort(al);
		System.out.println();
		System.out.println(al);
		//Object[] o=al.toArray();
		
		while (itr.hasNext()) {
			//itr.remove();
			System.out.println(itr.next());
			
		}
	}*/

}

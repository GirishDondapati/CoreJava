package com.girish.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class A11
{
	 String name="Hello";
	 int num=100;
}
public class ArrayListEx1 {

	public static void main(String args[])
	{
		A11 objA=new A11();
		ArrayList al=new ArrayList();
		System.out.println("ArrayList Started");
		System.out.println(al.add(objA));
		al.add(objA.num);
		al.add(objA.name);
		al.add(1, 122);
		al.set(1, 20);// set method allows only in arrayList but not support in LinkedList
		al.add("ggg");
		System.out.print(al.size());//arrayList is very useful in storage with out wasting memory i e..memory extension automatically done
		al.trimToSize();
		System.out.print("after trim:" +al.size());
		//System.out.println(al.trimToSize());//trimToSize method return type is void so sop not allow
		al.trimToSize();
		Iterator it=al.iterator();
		System.out.println("Iterator start with while loop in Al");
		while(it.hasNext())
		{
			//A11 a=A11(it.next());
			System.out.print(it.next()+" ");
			// how to print this arraylist ?? :-)
		}
		
		LinkedList ll=new LinkedList();// Coming to likedlist its not supports the set() method
		
		System.out.println("LinkedList Started");
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(3, 30);
		ll.add(60);
		ll.set(4,50);
		System.out.println(ll.size());
		Iterator it1=ll.iterator();
		System.out.println("Iterator start with while loop in ll");
		while (it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		
		List<String> list=new ArrayList<String>();
		
		
		

	}
	
}

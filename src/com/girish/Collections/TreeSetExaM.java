package com.girish.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExaM implements Comparable
{
	public static void before()
	{
		Set set=new TreeSet();
		set.add("2");
		set.add(90);
		set.add("20");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) 
	{
		
		/*TreeSetExaM.before();*/
		TreeSet ts=new TreeSet();
		ts.add(999);
		ts.add(32);
		ts.add(99);
		ts.add(22);
		ts.add(909);
		ts.add(621);
		//ts.add("aa");
		
		
		TreeSet<String> ts1=new TreeSet<String>();
	
		System.out.println(ts);
		TreeSet sd=new TreeSet();
		ts1.add("z");
		ts1.add("d");
		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		ts1.add("z");
		//ts1.add(10);
		System.out.println(ts1);
		/*TreeSet ts2=new TreeSet();
		ts2.add("121");
		ts2.add("120");
		ts2.add("122");
		ts2.add("233");
		ts2.add("233");
		ts2.add("122");
		ts2.add("124");
		ts2.add("232");
		ts2.add("230");
		ts2.add("10");
		System.out.println(ts2);
		SortedSet s1=ts2.headSet("232");
		System.out.println(s1);
		SortedSet s2=ts2.subSet("122", "233");
		System.out.println(s2);
		SortedSet s3=ts2.tailSet("15");
		System.out.println(s3);
		System.out.println(ts2.first()+"  "+ts2.last()+" " +ts2.floor("22"));
		*/
		

	}

	@Override
	public int compareTo(Object o) {
		System.out.println(this.compareTo(o));
		return this.compareTo(o);
		
	}

}
class ComparatorSort implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return ((i1<i2)?-1:(i1>i2?+1:0));
	}
}

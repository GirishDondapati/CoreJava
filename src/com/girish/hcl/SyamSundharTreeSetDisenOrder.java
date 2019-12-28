package com.girish.hcl;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class SetCompartor implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String fisrt=(String)o1;
		String second=(String)o2;
		return second.compareTo(fisrt);
	}

	

}

public class SyamSundharTreeSetDisenOrder 
{
	public static Comparator compare=null;
	public static void main(String[] args)
	{
		compare=new SetCompartor();
		Set<String> ts=new TreeSet<String>(compare);
		ts.add("aa");
		ts.add("vv");
		ts.add("cc");
		ts.add("zz");
		
		System.out.println(ts);
		
		
	}

}

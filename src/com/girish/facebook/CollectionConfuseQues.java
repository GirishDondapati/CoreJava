package com.girish.facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionConfuseQues {

	
	public static void main(String args[])
	{
	ArrayList a = new ArrayList();
	for(int i=1;i<9;i++)
	{
		a.add(String.valueOf(i));
	}
	Comparator c = Collections.reverseOrder();
	System.out.println(a);
	Collections.sort(a, c);
	System.out.println(a);
	int result = Collections.binarySearch(a, "6");
	System.out.println(result);
	
	



	}
	
}

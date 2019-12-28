package com.girish.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class LaraCollection1 {

	
	public static void main(String[] args) 
	{
			ArrayList list = new ArrayList();
			list.add("blue");
			list.add("yellow");
			list.add("indigo");
			list.add("red");
			Collections.sort(list);
			System.out.println(list);
			int i= Collections.binarySearch(list, "z");
			System.out.println(i);
	}
	


}

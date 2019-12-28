package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CognizentCollection {

	public static void main(String[] args)
	{
		/*List<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("a");
		al.add("b");
		al.add("a");
		al.add("b");
		for (String string : al) 
		{
			al.add("ahha");
			System.out.println(string);//ConcourrentModificationException
			//al.add(100,"aa");//IndexOutOfBoundsException: Index: 100, size: 6
			//System.out.println(string);
			//al.add("ab");
			
		}*/
		
		List al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(12, 40);//very one says ArryList by default size is 16 but if we give index as 6 but size is 3 
						//on that it gives java.lang.IndexOutOfBoundsException
		
		/*for(int i=0;i<=al.size();i++)// some times asking as a al.length(),al.length both are not support in al object
		{
			int val=al.size();// it gives java.lang.OutOfMemoryError
			al.add(val);
		}*/
		Iterator itr=al.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			al.add(30);
			al.add(40);
		}
		
	}

}

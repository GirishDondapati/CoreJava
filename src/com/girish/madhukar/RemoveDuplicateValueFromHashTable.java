package com.girish.madhukar;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateValueFromHashTable
{
	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable();
		ht.put("aaa", "123");
		ht.put("aab", "123");
		ht.put("aac", "123");
		ht.put("abb", "231");
		ht.put("abc", "231");
		ht.put("abd", "231");
		ht.put("abe", "231");
		ht.put("acc", "321");
		ht.put("acd", "321");
		ht.put("ace", "321");
		
		Hashtable rmDplVal = new Hashtable();
		Enumeration e = ht.keys();
	    while (e.hasMoreElements()) {
	      String key = (String) e.nextElement();
	      String value = (String) ht.get(key);
	      System.out.println(value+" &&& "+key);
	      if(!rmDplVal.containsKey(value))
	      {
	    	  rmDplVal.put(value, key);
	    	  System.out.println(value+"----"+key);
	      }
	    	  
	    }
	    System.out.println(rmDplVal);
		
	}
}

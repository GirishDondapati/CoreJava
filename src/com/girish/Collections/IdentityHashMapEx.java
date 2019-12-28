package com.girish.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapEx {
	public static void main(String[] args) {
		
		
		Map identityMap = new IdentityHashMap();
		Map hashMap = new HashMap();
		
		identityMap.put("a", 1);
		identityMap.put(new String("a"), 2);
		identityMap.put("a", 3);//here map override the value of the string pool object
		System.out.println(identityMap);
		identityMap.put("a", 5);
		
		hashMap.put("a", 1);
		hashMap.put(new String("a"), 2);
		hashMap.put("a", 3);
		System.out.println("Identity Map KeySet Size :: " +  identityMap.keySet().size());
		System.out.println("Hash Map KeySet Size :: " + hashMap.keySet().size());
		
		
		/*IdentityHashMap hm=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		hm.put(4,"sstt");
		hm.put(1,"giri");
		hm.put(2,"hari");
		hm.put(i1,"king");	
		hm.put(2,"harish");
		hm.put(i2,"kingdom");
		hm.put(2,"harish was ---");
		hm.put(5,"harish");
		hm.put(0,"girish");
		
		System.out.println(hm);
		
		//In Map KeySet() method will be gets the keys only
		Set s=hm.keySet();
		System.out.println(s);
	
		//In Map values() Method will be gets the values only
		Collection c=hm.values();
		System.out.println(c);
		
		Set s1=hm.entrySet();
		Iterator i=s1.iterator();
		
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+"--->"+m.getValue());
			if(m.getKey().equals(5))
				System.out.println(m.hashCode());
		}*/
		
		
		
		
		
		/*
		  // Create a hash map
	      IdentityHashMap ihm = new IdentityHashMap();
	      // Put elements to the map
	      ihm.put("Zara", new Double(3434.34));
	      ihm.put("Mahnaz", new Double(123.22));
	      ihm.put("Ayan", new Double(1378.00));
	      ihm.put("Daisy", new Double(99.22));
	      ihm.put("Qadir", new Double(-19.08));
	      
	      // Get a set of the entries
	      Set set = ihm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      // Deposit 1000 into Zara's account
	      double balance = ((Double)ihm.get("Zara")).doubleValue();
	      ihm.put("Zara", new Double(balance + 1000));
	      System.out.println("Zara's new balance: " +
	      ihm.get("Zara"));*/
	}
		

}

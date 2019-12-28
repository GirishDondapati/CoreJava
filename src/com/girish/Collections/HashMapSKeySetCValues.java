package com.girish.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSKeySetCValues 
{

	
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(4,"sstt");
		hm.put(1,"giri");
		hm.put(2,"hari");
		hm.put(3,"king");	
		hm.put(2,"harish");
		hm.put(3,"kingdom");
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
		}
		
		
	}

}

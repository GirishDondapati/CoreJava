package com.girish.Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEx 
{
	public static void main(String[] args) 
	{		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1, 1001);
		lhm.put(2, 1002);
		lhm.put(3, 1003);
		lhm.put(4, 1004);
		lhm.put(1, "1001re");
		Set s=lhm.entrySet();
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			lhm.put(4, "1004re");
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}
		
	}
}

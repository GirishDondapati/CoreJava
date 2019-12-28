package com.girish.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*public class MapEx1
{
	public static void main(String args[])
	{
		Map<ArrayList<String>String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		hm.addMap("a","a1");
		Map m=new HashMap();
		m.put("key1", "value1");
		m.put("key2", "value2");
		m.put("key3", "value3");
		m.put("key4", "value4");
		m.put("key1", "value5");
		m.put("key2", "value6");
		m.put("key3", "value7");
		m.put(null, "value8");

		Object obj=m.put("key5", "value8");
		if(obj!=null)
		{
			System.out.println(obj+""+m.get(obj));
		}
		
		
		Object obj2=m.put("key1", "value2");
		if(obj2!=null)
		{
			System.out.println(obj2);
		}
		Object obj3=m.put("key1", "value2");
		if(obj3!=null)
		{
			System.out.println(obj3);
		}
		
		
		
	}
}*/


public class MapEx1 {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Map m = new HashMap();  
        m.put(1, "Vinod");  
        m.put(2, "Kumar");  
        m.put(3, "Nair");  
        m.put(1, "!!!");  
        System.out.println(m.keySet()); //It gives all keys: [1,2,3]
        System.out.println(m.values());//It gives all values
        System.out.println(m.put(4, "sysout"));//It gives : null
        System.out.println(m.remove(3)+" remove called");//it removes 3 key and display key value
        
        for(int i=1; i<=m.size(); i++){  
              m.put(1, "!!!forReplays"+i);
            System.out.println("Map Values "+m.get(i));  
           // m.clear();//It gives java.util.ConcurrentModificationException
        }  
       
        m.put(3, "nairreplays");
        Set s=m.entrySet();
        Iterator itr=s.iterator();
        m.put(1, "!!!replays");
        while(itr.hasNext())
        {
        	m.put(1, "!!!!replays");
        	Map.Entry e=(Map.Entry)itr.next();
        	System.out.println(e.getKey()+"  "+e.getValue());
        }
        m.clear();//at ending of program it don't give any exception
    }  
  
}  
/*package com.girish.InterviewQues;

public class MapDuplicationFind
{
	int id;
	String value;
	public MapDuplicationFind(int a,String b)
	{
		this.id=a;
		this.value=b;
		
	}
	public int compareTo(Object obj)
	{
		MapDuplicationFind mdp=(MapDuplicationFind)obj;
		if(id==mdp.id)
			return 0;
		else
			if(id>mdp.id)
				return 1;
			else
				return -1;
	}
}*/
package com.girish.InterviewQues;
//finding duplicates in map

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDuplicationFind
{
	public static void main(String args[])
	{
		Map<String, ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		//hm.addMap("a","a1");
		Map m=new HashMap();
		m.put("key1", "value1");
		m.put("key2", "value2");
		m.put("key3", "value3");
		m.put("key4", "value4");
		m.put("key1", "value5");
		m.put("key2", "value6");
		m.put("key3", "value7");
		//  for(int i=o;i<)

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
}


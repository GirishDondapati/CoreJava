package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TechMahendraArrayList 
{
	
		public static void main(String[] args) {
			
			List<Integer> al=new ArrayList<Integer>();
			al.add(101);
			al.add(20);
			al.add(50);
			//System.out.println(al);  //It gives only [10, 20, 50]
			System.out.println(al.size());
			al.add(30);
			Iterator<Integer> itr=al.iterator();
			System.out.println(itr);
			//Collections.sort(al);
			/*al.add(80);
			al.add(60); */ //We can't add elements after Creating Iterator Interface object 
							//it gives Following Exception java.util.ConcurrentModificationException
			//al.remove(1);//its also throw same error
			al.set(1,11);//after iterator set method allows but first element also displayed on output
			al.set(1, 12);
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				//System.out.println(itr.next().equals(10));//if equals returns true else false
				//System.out.println(itr.next().compareTo(20));//If equals returns 0 else 1
				//System.out.println(itr.next().floatValue());//it retunds 20.0, 30.0  .....
				//al.add(120);//here also not possile same error will be occur
				}
			al.add(70);
			al.add(100);//after compleastion of Iterator feaching add will be accpted but not display above while

		}

		public int compareTo(Object o) {
			
			return this.compareTo(o);
		}

		/*@Override
		public int compare(Object o1, Object o2) {
			Integer i1=(Integer)o1;
			Integer i2=(Integer)o2;
			return ((i1<i2)?-1:(i1>i2?+1:0));
		}
	*/
	

}

/*
 * http://www.journaldev.com/122/hashmap-vs-concurrenthashmap-%E2%80%93-example-and-exploring-iterator
 * 
 * 
 * If you are a Java Developer, I am sure that you must be aware of ConcurrentModificationException that comes when you want to modify the Collection object while using iterator to go through with all its element. Actually Java Collection Framework iterator is great example of iterator design pattern implementation.

Java 1.5 has introduced java.util.concurrent package with Collection classes implementations that allow you to modify your collection objects at runtime.

ConcurrentHashMap is the class that is similar to HashMap but works fine when you try to modify your map at runtime.

Lets run a sample program to explore this:

ConcurrentHashMapExample.java

package com.journaldev.util;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
 
public class ConcurrentHashMapExample {
 
    public static void main(String[] args) {
 
        //ConcurrentHashMap
        Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        Iterator<String> it = myMap.keySet().iterator();
 
        while(it.hasNext()){
            String key = it.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("ConcurrentHashMap after iterator: "+myMap);
 
        //HashMap
        myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();
 
        while(it1.hasNext()){
            String key = it1.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("HashMap after iterator: "+myMap);
    }
 
}
When we try to run the above class, output is

ConcurrentHashMap before iterator: {1=1, 5=1, 6=1, 3=1, 4=1, 2=1}
ConcurrentHashMap after iterator: {1=1, 3new=new3, 5=1, 6=1, 3=1, 4=1, 2=1}
HashMap before iterator: {3=1, 2=1, 1=1, 6=1, 5=1, 4=1}
Exception in thread "main" java.util.ConcurrentModificationException
    at java.util.HashMap$HashIterator.nextEntry(HashMap.java:793)
    at java.util.HashMap$KeyIterator.next(HashMap.java:828)
    at com.test.ConcurrentHashMapExample.main(ConcurrentHashMapExample.java:44)
Looking at the output, its clear that ConcurrentHashMap takes care of any new entry in the map whereas HashMap throws ConcurrentModificationException.
*/
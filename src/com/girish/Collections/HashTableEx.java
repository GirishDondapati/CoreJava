package com.girish.Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEx {
	 public static void main(String args[]){  
	   
	  Hashtable hm=new Hashtable();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul"); 
	  hm.put(104, null);//hashtable not allow the null key and null value also
	 // hm.put(105, null);
	//  hm.put(104, null);
	  
	  Set set=hm.entrySet();  
	  Iterator itr=set.iterator();  
	  
	  while(itr.hasNext()){  
		  //hm.put(115, "In While loop added");
		  //in retriving time we can override any key it accepeted but we can't increase size of map i.e we can't put new key in retiving time
		  //it gives cuncarentamodificationException if we change any object value it change
	   Map.Entry m=(Map.Entry)itr.next();  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
}

/*A Hashtable is an array of list.Each list is known as a bucket.The position of bucket is identified by calling the hashcode() method.A Hashtable contains values based on the key. It implements the Map interface and extends Dictionary class.
It contains only unique elements.
It may have not have any null key or value.
It is synchronized.
*/

/*What is difference between HashMap and Hashtable?

1) HashMap is not synchronized.	Hashtable is synchronized.
2) HashMap can contain one null key and multiple null values.	Hashtable cannot contain any null key nor value.*/
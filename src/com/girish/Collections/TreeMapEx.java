package com.girish.Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	 public static void main(String args[]){  
	   
	  TreeMap hm=new TreeMap();  
	  //hm.put(null, "qwq");//TreeMap does not allow the null key why shorting time it creates problem
	 // hm.put(null, null);//it allows multiple null values 
	  hm.put(106, null);
	  hm.put(107,null);
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul");  
	  //hm.put(null,null);// it throws null pointer exception
	  
	  Set set=hm.entrySet();  
	  Iterator itr=set.iterator();  
	  //hm.put(115, "after Itr");//it throws councarentModificationException
	  
	  while(itr.hasNext()){ 
		  hm.put(115, "In while loop");
	   Map.Entry m=(Map.Entry)itr.next();  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
 }

package com.girish.Collections;

import java.util.*;

public class HashMapDemo {
   public static void main(String args[]) {
      // create hash map
      HashMap newmap = new HashMap();
      
      // populate hash map
      newmap.put(1, "tutorials");
      newmap.put(2, "point");
      newmap.put(3, "is best");
      newmap.put(4, "point");
      newmap.put(1, "tutoria");
      System.out.println(newmap);
      
      Collection c=newmap.values();
      System.out.println(c);
      HashSet hs=new HashSet(c);
      System.out.println(hs);
      
      // get value of key 3
      String val=(String)newmap.get(3);
      String val2=(String)newmap.get(2);
      
      // check the value
      System.out.println("Value for key 3 is: " + val);
      System.out.println("hash code is:"+val.hashCode());
      System.out.println("Value for key 2 is: " + val2);
      System.out.println("hash code is:"+val2.hashCode());
   }    
}
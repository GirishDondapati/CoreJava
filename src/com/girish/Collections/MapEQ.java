package com.girish.Collections;

import java.util.*;

public class MapEQ {

  public static void main(String[] args) {
   Map<ToDos, String> m = new HashMap<ToDos, String>();
   ToDos t1 = new ToDos("Monday");
   ToDos t2 = new ToDos("Monday");
   ToDos t3 = new ToDos("Tuesday");
   m.put(t1, "doLaundry");
   m.put(t2, "payBills");
   m.put(t3, "cleanAttic");
   System.out.println(m.size());
   String val=(String)m.get(t1);
   String val2=(String)m.get(t2);
   
   // check the value
   System.out.println("Value for key 3 is: " + val);
   System.out.println("hash code is:"+val.hashCode());
   System.out.println("Value for key 2 is: " + val2);
   System.out.println("hash code is:"+val2.hashCode());
   
} }

class ToDos{

  String day;

  ToDos(String d) { day = d; }

  public boolean equals(Object o) {
      return ((ToDos)o).day == this.day;
 }

// public int hashCode() { return 9; }
}
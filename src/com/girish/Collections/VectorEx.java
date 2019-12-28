package com.girish.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.Collections;

public class VectorEx {
	 
	  public static void main(String[] args) {
	   
	    //create Vector object
	    Vector v = new Vector();
	   
	    //Add elements to Vector
	    v.add("1");
	    v.add("3");
	    v.add("5");
	    v.add("2");
	    v.add("4");
	    v.add("3");
	    
	 
	    /*
	      To sort a Vector object, use Collection.sort method. This is a
	      static method. It sorts an Vector object's elements into ascending order.
	    */
	    Collections.sort(v);
	   
	    //display elements of Vector
	    System.out.println("Vector elements after sorting in ascending order : ");
	   
	    for(int i=0; i<v.size(); i++)
	    {
	      System.out.print(v.get(i)+ "  ");
	    }    
	    
	    
	    Iterator it=v.iterator();
	    System.out.println();	    
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+"  ");
	    }
	    System.out.println();
	    
	    
	    for (Object object : v) 
	    {
			System.out.print(object.toString()+"  ");
		}
	 
	  }
	}



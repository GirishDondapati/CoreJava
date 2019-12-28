package com.girish.Collections;

import java.util.Map;
import java.util.WeakHashMap;

/*public class WeakHashMapEx {
	   private static Map map;
	   
	   
	   
	   public static void main (String args[]) {
	      map = new WeakHashMap();
	      map.put(new String("Maine"), "Augusta");
	      
	      Runnable runner = new Runnable() {
	         public void run() {
	            while (map.containsKey("Maine")) {
	               try {
	                  Thread.sleep(500);
	               } catch (InterruptedException ignored) {
	               }
	               System.out.println("Thread waiting");
	               System.gc();
	            }
	         }
	      };
	      Thread t = new Thread(runner);
	      t.start();
	      System.out.println("Main waiting");
	      try {
	         t.join();
	      } catch (InterruptedException ignored) {
	      }
	   }
	}*/


import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public strictfp class  WeakHashMapEx {

	public strictfp static void main(String[] args) {

		/*
		 * the keys are stored as weak references, and when the reference is no
		 * more alive, the entire key-value pair is removed from the WeakHashMap
		 */

		Map<String, String> hashMap = new HashMap<String, String>();
		Map<String, String> weakHashMap = new WeakHashMap<String, String>();

		String keyHashMap = new String("keyHashMap");
		String keyWeakHashMap = new String("keyWeakHashMap");

		hashMap.put(keyHashMap, "helloHash");
		weakHashMap.put(keyWeakHashMap, "helloWeakHash");

		System.out.println("Before: hash map value and weak hash map : ");
		System.out.println(hashMap.values());
		System.out.println(weakHashMap.values());

		keyHashMap = null;
		keyWeakHashMap = null;
		System.gc();

		System.out.println(" ");
		System.out.println("After: hash map value and weak hash map :");
		System.out.println(hashMap.values());
		System.out.println(weakHashMap.values());

	}
} 
 
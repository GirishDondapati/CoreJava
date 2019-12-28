package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class EgSystemTestOnString
{
	
	/*public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("one-1");
		str.add("two-2");
		str.add("three-3");
		str.add("four-4");
		str.add("five-5");
		str.add("six-6");
		str.add("seven-7");
		str.add("eight-8");
		str.add("nine-9");
		str.add("nine-9");
		str.add("ten-10");
		
		System.out.println("current array list is : "+str);
		System.out.println("number of elements in the list  : " +str.size());
		ArrayList<String> a1 = new ArrayList<String>();
		a1.addAll(str);
		//System.out.println("current array list is : "+a1);
		HashSet<String> uniquevalues = new HashSet<String>(a1);
		System.out.println("the arraylist with unique values " +uniquevalues);
		Collections.sort(str);
		System.out.println("after sorting in asccending oeder");
		for(String arraylist: str){
			System.out.println(arraylist);
		}
		Collections.sort(str,Collections.reverseOrder());
		System.out.println("after sorting in descending order");
		for(String arraylist1: str){
			System.out.println(arraylist1);
		}
	}*/
	
	/*public static void main(String args[])
	{
		int count1=0, count2=0;
		String str="FIRSTNAME#MIDDLENAME#LASTNAME@AGE";
		StringTokenizer st= new StringTokenizer(str);
		StringTokenizer st1= new StringTokenizer(str,"#");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
			}
		for(int i = 0; i < str.length(); i ++){
			
			if(str.charAt(i)=='#'){
				++ count1;
				}
		
			if(str.charAt(i)=='@'){
				++ count2;
				}
		}
		System.out.println("the number of @ in the string" +count2);
		System.out.println("the number of # in the string" +count1);
		System.out.println("indexof(#):" +str.indexOf('#'));
		System.out.println("lastindexof(#):" +str.lastIndexOf('#'));
		System.out.println("replace of # by $:" +str.replace("#","$"));

		String st2=st.nextToken("#");	
		System.out.println("firstname in upper case;" +st2.toUpperCase());
		String firstPart = "";
     		String secondPart = "";
        	for (int j = 0; j < st2.length(); j++) {
            		if ( j < st2.length() /2) {
                		firstPart += st2.charAt(j);
            			}else
               		 secondPart += st2.charAt(j);
     			}
		System.out.println("the firstname by 2");
        	System.out.println(firstPart);
        	System.out.println(secondPart);
		String str3=str.replace("#"," ");
		String str4=str3.replace("@"," ");
		System.out.println("all  three names with blank space:" +str4);
		StringTokenizer token = new StringTokenizer(str, "@");
		while (token.hasMoreTokens()){
    			System.out.println(token.nextToken());
		}
		String st5 = new StringBuffer(st2).reverse().toString();
		System.out.println("reverse order of the firstname:" +st5);
		}*/
}

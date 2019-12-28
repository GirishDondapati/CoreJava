package com.girish.String;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class WordAndLetterCount {
	public static void main(String[] args) throws IOException
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Please insert string: ");
	    String s = sc.nextLine();
	    sc.close();
	    System.out.println("Given String is: "+s);
	    //Print  each word how many times repeated in given string 
        String[] splitStr = s.split(" ");
        int count = 0;
        List<String> list = new ArrayList<String>();
        for(String s1:splitStr){
            if(!list.contains(s1)){
                list.add(s1);
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<splitStr.length;j++){
                if(list.get(i).equalsIgnoreCase(splitStr[j])){
                    count++;
                }
            }
            System.out.println("Occurrence of " + list.get(i) + " is " + count + " times.");
            count=0;
        }
        
        StringReader r = new StringReader(s);

	    Map<Character, Integer> m = new TreeMap<Character, Integer>();
	    int c;
	    //System.out.println(r.read());
	    while ((c = r.read()) != -1) {	    	 
	      Integer count1 = m.get((char) c);
	      if (count1 == null)
	      {
	        count1 = 0;
	      }
	      m.put((char) c, count1 + 1);
	    }
	    r.close();
	    for (Entry<Character, Integer> entry : m.entrySet())
	      System.out.println(entry.getKey() + " count is: " + entry.getValue());
	  }

	  private static String createAsterisk(int number) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < number; i++)
	      sb.append("*");
	    return sb.toString();
	  }
     
}

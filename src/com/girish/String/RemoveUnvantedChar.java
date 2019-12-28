package com.girish.String;

public class RemoveUnvantedChar
{
	  public static void main(String[] args)
	  {
	    String s = "(123)-456-7891adc";
	    s = s.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(s);
	  }
	 
}

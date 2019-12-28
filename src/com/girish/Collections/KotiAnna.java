package com.girish.Collections;

import java.util.HashMap;
import java.util.Map;

public class KotiAnna {
	public static void main(String[] args) {
		
	
		
	KotiAnna t= new KotiAnna();
	t.display1("koti");
	t.display("blr");
				
	}
	
	
	
	public void display(String displayName){
		
		final String name1="KoTI";
		final String name2="TCS";
		final String name3="NIELSEN";
		final String name4="ECITY";
		final String name5="BlR";
		
		if(displayName.equalsIgnoreCase(name1)){
			System.out.println(displayName);
		}else if(displayName.equalsIgnoreCase(name2)){
			System.out.println(displayName);
		}else if(displayName.equalsIgnoreCase(name3)){
			System.out.println(displayName);
		}else if(displayName.equalsIgnoreCase(name4)){
			System.out.println(displayName);
		}else if(displayName.equalsIgnoreCase(name5)){
			System.out.println(displayName+"bler");
		}else{
			System.out.println("worng input");
		}
		
	}
	
	public void display1(String displayName)
	{
		
		Map<String, String> names=new HashMap<String,String>();
			
		names.put("KOtI", "displayname is koti");
		names.put("TCS", "displayname is tcs");
		names.put("NIELSEN", "displayname is nielsen");
		names.put("ECITY", "displayname is Ecity");
		names.put("BLR", "displayname is blr");
		
		
		
		boolean value=names.containsKey(displayName.toUpperCase());
	//	boolean value=names.
		
		if(value){
			System.out.println(names.get(displayName.toUpperCase()));
		}else{
			System.out.println("ohh wromg");
		}
		
	}
	
	}

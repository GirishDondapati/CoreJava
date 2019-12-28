package com.girish.String;

public class StringReverseUsingRecursiveAlg 
{
	String reverse = "";
    
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
        	System.out.println(str.substring(0,str.length()-1));
            reverse += str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
        StringReverseUsingRecursiveAlg srr = new StringReverseUsingRecursiveAlg();
        System.out.println("Result: "+srr.reverseString("Java2 novice"));
    }

}

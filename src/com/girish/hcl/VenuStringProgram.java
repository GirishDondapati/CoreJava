package com.girish.hcl;

public class VenuStringProgram 
{ 
	public static void main(String[] args) 
	{
		//He asked in the below strings we have to add in single string by removing \ symbols
		//He give following string 
		
		 String s1="abc\C";
		String s2="bcd\";
		String s3="cde\";  
		
		
		//I don't know in the end of the string we can't added the backslash. So iI written code for that by using removeAll() methods
		
		//Solution for that Question?
		/*
		 * In String class we can't put single backward slash. It is String literals  concept 
		 * for example if we use File concept we added the path for loading particular file on that we have to pass path as string
		 * there we must and should declare as \\ that jvm internally taken as single \
		 * 
		 * So The \ is one literal, In String we pass any \ after letter it treated as special symbol. After \symbol valid are:
		 * (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		 *  
		 *  
		 */
	}

}

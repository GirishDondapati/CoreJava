package com.girish.interviewtest;

public class PrintAllVowelInGivenString 
{
	public static void main(String[] args) {
		String str="Hella U Are";
		//Expected output: e,o,U,a,e,e,a,i,a,a,o,a,i
		PrintAllVowelInGivenString pa=new PrintAllVowelInGivenString();
		//System.out.println(pa.getVowels(str));
		/*int l=str.length();
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if ("aeiouAEIOU".indexOf(c) != -1) {
			    System.out.print(c+",");
			}		
		}*/
		System.out.println(pa.getStringWith(str));
	}
	public String getVowels(String s) 
	{ 
	String vowels = "aeiouAEIOU"; 
	String res=""; 
	for( int i = 0; i < s.length(); i++ ) 
	if( vowels.indexOf( s.charAt( i ) ) != -1 ) 
	res=res+s.charAt( i ); 
	return res; 
	}
	public StringBuffer getStringWith(String s)
	{
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='A')
			{
				sb.append("@");
			}
			else if(s.charAt(i)==' ')
			{
				sb.append("#");
			}
			else
			{
				sb.append(s.charAt(i));
			}
				
			
		}
		return sb;
	}

}

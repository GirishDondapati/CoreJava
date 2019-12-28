package com.girish.InterviewQues;
//String reverse without using reverse
class StringReverse 
{	
	/*public static void main(String[] args)
	{
		String str="girish";
		System.out.println("Given String is:" +str);
		int len=str.length()-1;
		StringBuffer sb=new StringBuffer(10);
		System.out.println(sb.capacity());
		while(len>=0)
		{
			sb=sb.append(str.charAt(len));
			len--;
		}
		System.out.println("Reverse string is:" +sb);
		System.out.println(sb.capacity());
	}*/
	public static void main(String args[])
	{
		String str="hi peer how are you";
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			String str2=new String(str1[i]);
			char ch[]=str2.toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}

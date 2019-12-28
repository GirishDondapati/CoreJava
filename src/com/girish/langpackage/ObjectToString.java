package com.girish.langpackage;

public class ObjectToString
{
	String str;
	int  rollno;
	public ObjectToString(String str,int rollno)
	{
			this.rollno=rollno;
			this.str=str;
			System.out.println(str+" "+rollno);
	}
	public String toString()
	{
		return getClass().getName()+" @  "+Integer.toHexString(hashCode());
		//return "hi darling";
	}
	public static void main(String[] args) 
	{
		ObjectToString o=new ObjectToString("girish", 10);
		ObjectToString o1=new ObjectToString("king",20);
		//every object internally override the toString method if we pint that object its display as follows
		//com.girish.langpackage.ObjectToString @  7a2760f
		System.out.println(o);
		System.out.println(o1);
		
		
		String s=new String("girish");
		Integer i=new Integer(10);
		StringBuffer sb=new StringBuffer("    ****");
		System.out.println(s);
		System.out.println(i);
		System.out.println(sb);
	}

}

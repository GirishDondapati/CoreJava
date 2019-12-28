package com.girish.langpackage;

public class ObjectEquals {
	String name;
	int rollno;
	public ObjectEquals(String name,int roolno) 
	{
		this.rollno=rollno;
		this.name=name;
	}

	public static void main(String[] args) 
	{
		ObjectEquals o=new ObjectEquals("girish", 10);
		ObjectEquals o1=new ObjectEquals("king", 20);
		ObjectEquals o2=new ObjectEquals("bong", 30);
		ObjectEquals o3=o;
		System.out.println(o.equals(o1));
		System.out.println(o.equals(o2));
		System.out.println(o.equals(o3));
			
		System.out.println(o==o1);
		System.out.println(o==o2);
		System.out.println(o==o3);

		
	}

}

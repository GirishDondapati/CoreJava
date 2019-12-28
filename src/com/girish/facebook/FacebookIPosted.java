package com.girish.facebook;

interface TestVariable1
{
	int x=10;
	
}
interface TestVariable2
{
	int x=20;
	
}

public class FacebookIPosted implements TestVariable1,TestVariable2
{
	public static void main(String[] args) {
		FacebookIPosted fi=new FacebookIPosted();		
		System.out.println(fi.x);
	}	
}

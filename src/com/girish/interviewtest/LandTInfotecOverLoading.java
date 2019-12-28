package com.girish.interviewtest;
/*
 
 
 
 */
class A implements Cloneable{

	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}

public class LandTInfotecOverLoading
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		A oa = new A();
		A oa1 = (A) oa.clone();
	}
}

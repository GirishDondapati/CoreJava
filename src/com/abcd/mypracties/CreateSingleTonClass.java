package com.abcd.mypracties;

public class CreateSingleTonClass 
{
	private static CreateSingleTonClass cs;
	
	private CreateSingleTonClass() 
	{
		
	}
	
	public static CreateSingleTonClass getInstance()
	{
		if(cs==null)
		{
			cs=new CreateSingleTonClass();
		}
		return cs;
	}
	public Object clone()
	{
		return this;
	}
	
	public static void main(String args[])
	{
		CreateSingleTonClass cs=new CreateSingleTonClass();
		cs.getInstance();
		System.out.println(cs.hashCode());
		
		CreateSingleTonClass cs1=new CreateSingleTonClass();
		cs1.getInstance();
		System.out.println(cs1.hashCode());
		
		CreateSingleTonClass cs2=new CreateSingleTonClass();
		cs2.getInstance();
		System.out.println(cs2.hashCode());
		
	}

}

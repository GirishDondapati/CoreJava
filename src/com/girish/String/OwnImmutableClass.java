package com.girish.String;

public final class OwnImmutableClass
{
	private final int[] myArray;
	public OwnImmutableClass(int[] anArray)
	{
		//this.myArray=anArray;//its wrong declrestion 
		this.myArray=anArray.clone();
	}
	public String toString()
	{
		StringBuffer sb=new StringBuffer("nubers are: ");
		for(int i=0;i<myArray.length;i++)
		{
			sb.append(myArray[i]+" ");
		}
		return sb.toString();
	}

}

package com.girish.facebook;

public class SrinivasInCatchBlockPassObjectRef 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("trystart");
			int i=10/0;
			System.out.println("tryend");
		}
		catch(Error e)
		{
			System.out.println("catch block");
		}
		/*catch(Object o)
		{
			System.out.println("object catching is not possible");
		}*/

	}

}

package com.girish.datastructures;

public class FindingNotRepeatedNumberFromArray
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,1,2,3,4,5,4,5,5,6,6,7,7,3,9,1,2,5};
		
		
		int result = 0;
		for (int i : arr) 
		{
			result ^= i;
			System.out.println(result);
		}
		System.out.println(result);
		
	}

}

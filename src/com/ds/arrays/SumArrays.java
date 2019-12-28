package com.ds.arrays;

public class SumArrays {

	public static void main(String[] args)
	{	int search = 5;
		int array[] = { 0,2, 3, 4, 6, 7, 8,3,2 };
		int j = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < search) 
			{
				array[j] = array[i];
				System.out.println(array[j]);
			}
		}
		
		//System.out.println(array[j]);
		int[] b = new int[j];
		System.arraycopy(array, 0, b, 0, j);
		
		array = b;
	}

}

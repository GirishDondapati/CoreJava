package com.girish.Interviews2020;

public class SamsungLogicProb
{ 
	public static void main(String args[])
	{
		SamsungLogicProb obj = new SamsungLogicProb();
		int arr1[] = {1,1,2,3,4,5,5,6};
		int arr2[] = {1,3,5,5,7,8};
		int arr3[] = {1,5,5,8,9,10,15};

		obj.findCommonValues(arr1, arr2, arr3);
	}

	private void findCommonValues(int arr1[], int arr2[], int arr3[]) 
	{ 
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) 
		{ 
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) 
			{
				System.out.print(arr1[i]+" "); i++; j++; k++;
			}
			else if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr3[k])
				j++;
			else
				k++;
		}
	}
}

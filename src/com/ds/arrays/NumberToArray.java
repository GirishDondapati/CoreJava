package com.ds.arrays;

import java.util.Arrays;

public class NumberToArray {

	
	public static void main(String[] args) {
		Number[ ] price= {10,20,30,40,50};
		int l=price.length;
		int[] k=new int[l];
		for(int i=0;i<l;i++)
		{
			k[i]=price[i].byteValue();
			
		}
		System.out.println(Arrays.toString(k));
	}

}

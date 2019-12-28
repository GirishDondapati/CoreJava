package com.ds.arrays;

import java.util.Arrays;

public class ArraysToStringArraysDepToStringDiff {
	
	public static void main(String[] args) {
		int[] array={'1','2','5','6'};
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.deepToString(args));
		int[][] marr=new int[4][4];
		marr[0][0]=1;
		System.out.println(Arrays.toString(marr));
		System.out.println(Arrays.deepToString(marr));
		
		

	}

}

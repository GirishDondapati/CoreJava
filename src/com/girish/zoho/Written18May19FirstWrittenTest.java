package com.girish.zoho;

import java.util.Arrays;
/*
 *	In First Round Written Programs 
 */
public class Written18May19FirstWrittenTest
{
	public static void main(String[] args)
	{
		int[] arr = {5,4,3,2,1};
		Arrays.sort(arr);
		
		for(int i = arr.length-1; i >= 0; i--)
			System.out.print(arr[i]+" ");
	}
	
}

/*public class Written18May19FirstWrittenTest
{
	public static void main(String[] args)
	{
		String str = "ABCDEF";
		StringBuffer sf = new StringBuffer(str).reverse().reverse().toString();
		System.out.println(sf);
	}
}
*/
/*
 * Below program what is the output with options they asked
 */
/*public class Written18May19FirstWrittenTest
{
	public static void main(String[] args) {
		System.out.println(args[0]);
	}

}*/

/*
 * what will be output for below program
 */
/*public class Written18May19FirstWrittenTest
{
	public static void test()
	{
		System.out.println("Static method called");
	}
	
	public static void main(String[] args)
	{
		Written18May19OnMain obj = null;
		obj.test1();
	}
}*/

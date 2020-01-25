package com.girish.interviewtest;

/*Input: s = “geeks quiz practice code”
Output: s = “code practice quiz geeks”

Input: s = “getting good at coding needs a lot of practice”
Output: s = “practice of lot a needs coding at good getting”*/

/*public class AcolliteSFW
{
	public static void main(String[] args) 
    { 
        String s[] = "i like this program very much".split(" "); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
        System.out.println("Reversed String:"); 
        System.out.println(ans.substring(0, ans.length() - 1)); 
    } 
}*/


public class AcolliteSFW
{
	public static void print2largest(int arr[],int arr_size) 
	{ 
		int i, first, second; 
		
		/* There should be atleast two elements */
		if (arr_size < 2) 
		{ 
			System.out.print(" Invalid Input "); 
			return; 
		} 
		System.out.println(Integer.MIN_VALUE);
		first = second = Integer.MIN_VALUE; 
		for (i = 0; i < arr_size ; i++) 
		{ 
			/* If current element is smaller than  
			first then update both first and second */
			if (arr[i] > first) 
			{ 
				second = first; 
				first = arr[i]; 
			} 
			
			/* If arr[i] is in between first and  
			second then update second  */
			else if (arr[i] > second && arr[i] != first) 
				second = arr[i]; 
		} 
		
		if (second == Integer.MIN_VALUE) 
			System.out.print("There is no second largest"+ " element\n"); 
		else
			System.out.print("The second largest element"+ " is "+ second); 
	} 
	
	/* Driver program to test above function */
	public static void main(String[] args)  
	{ 
		int arr[] = {120, 35, 1, 10, 34, 1}; 
		int n = arr.length; 
		print2largest(arr, n); 
	} 
}
package com.girish.interviewtest;

public class Hcl3 {	
	public static void main(String[] args) {
		int i;
		int j=2;
		if(j<5)
		{
			i=2+j;
			System.out.println(i);
		}
		//System.out.println(i);// Out side of the if condition we call the i value 
								//it show compile time error The local variable i may not have been initialized
	}

}

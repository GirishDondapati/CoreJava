package com.girish.interviewtest;

public class ManhattenTechRound {

	public static void main(String[] args) {
		int x=2;
		Integer y=null;
		System.out.println(y);
		//int z=null; //Type mismatch: cannot convert from null to int (compile time error shows)
		y=x;  //2 allocate to y 
		System.out.println(y=x);

	}

}

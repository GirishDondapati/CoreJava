package com.girish.facebook;

import java.util.Scanner;

public class FaceBookFrienAsskQue {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number: ");
		 float f=sc.nextFloat();
		 int i=(int)Math.floor(f);
		 if(i==f)
		 {
			 System.out.println(f);
		 }
		 else 
		 {
			 System.out.println(i+1);
		 }
		
			 
	}

}

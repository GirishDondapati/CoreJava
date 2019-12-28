package com.girish.exstatic;


//Can i use the static variable in non static method????? 
public class StaticEx2 {
	
		static int a=12; 


		public static void m(){ 
		System.out.println("outside method a is: "+a);	
		a=16; 
		System.out.println("Static method A is "+a); 
		} 
		public void r(){ 
		a=17; 
		System.out.println("Non Static method A is "+a);	
		} 

		public static void main(String []arg){ 
		m(); 
		StaticEx2 ob=new StaticEx2(); 
		ob.r(); 
		} 
		
}

//Yes it is possible but vice-versa is not possible.

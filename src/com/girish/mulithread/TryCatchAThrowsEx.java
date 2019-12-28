package com.girish.mulithread;

public class TryCatchAThrowsEx {

public static void main(String[] args){
try{
TryCatchAThrowsEx e= new TryCatchAThrowsEx();
e.m();
int x = 10+21;
System.out.println("value is\t"+x);
}catch(Exception e){
e.printStackTrace();
}
}

public void m(){
try{
int i=0;
System.out.println("value is ::\t"+10/i);
}catch(Exception e){
e.printStackTrace();
}
}
	
	/*public void m()
	{
		
		int i=0;
		System.out.println("value is ::\t"+10/i);
		
	}
	
	public static void main(String[] args)throws ArithmeticException
	{
		
		int x = 10+21;
		System.out.println("value is\t"+x);
		TryCatchAThrowsEx e= new TryCatchAThrowsEx();
		e.m();
		int x = 10+21;
		System.out.println("value is\t"+x);
		
		}
*/
		
}
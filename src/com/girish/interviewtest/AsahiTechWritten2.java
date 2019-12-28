package com.girish.interviewtest;

public class AsahiTechWritten2 {

	int x = 10;  //If we make as static it will effect all objects 60 
	int y =20;	 //If we make as static it will effect all objects 60
	public static void main(String[] args)
	{
		
		AsahiTechWritten2 obj1 = new AsahiTechWritten2();
		obj1.x = 20;
		obj1.y = 30;
		AsahiTechWritten2 obj2 = new AsahiTechWritten2();
		obj2.x = 30;
		obj2.y = 40;
		
		System.out.println(obj1.x + obj1.y);
		System.out.println(obj2.x + obj2.y);
		

	}
}

// Static methods can override or not?
// 

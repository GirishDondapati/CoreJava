package com.girish.interviewtest;

public class TekSystemsDataTypesCompa {

	public static void main(String[] args)
	{
		Double d1=new Double(10.0);
		Double d2=new Double(10.0);
		int x=10;
		float f=10.0f;
		
		System.out.println(d1==d2);
		System.out.println(d1==x);
		System.out.println(x==f);
		System.out.println(d1==f);
		System.out.println();		
		
		Integer x1=new Integer(10);
		Float f1=10.0f;
		Float f11=10.0f;
		Float f2=new Float(10.0);
		
		System.out.println(x==x1);
		//System.out.println(x1==f1);//It show compile time error as: Incompatible operand types Integer and Float
		System.out.println(f1==f2);
		System.out.println(f==f2);
		System.out.println(f==f1);
		System.out.println(f1==f11);

	}

}

package com.girish.AccessModifiers;

class Asuper
{
	public int a;
	protected int b;
	int c;
	private int d;
}
public class VariablesWithAccesSpecifiers extends Asuper{

	public static void main(String[] args) 
	{
		Asuper obj1=new Asuper();
		obj1.a=10;
		obj1.b=20;
		obj1.c=30;
		//obj1.d=40; //we can't assign value for 'd' from out side of the class
		VariablesWithAccesSpecifiers obj2=new VariablesWithAccesSpecifiers();
		obj2.a=10;//with out extending Asuper we can't intilize value through child class object
		Asuper obj3=new VariablesWithAccesSpecifiers();
		
		
	}

}

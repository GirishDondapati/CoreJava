package com.girish.interviewtest;

public class CognizentOverloadingQu 
{
	public void method(int x,int y)
	{
		System.out.println("Int type "+x+"  "+y);
	}
	public void method(Integer x,Integer y)
	{
		System.out.println("Integer type "+x+"  "+y);
	}
	public void method(float x,float y)
	{
		System.out.println("Int type "+x+"  "+y);
	}
	public void method(double x,int y)//here he given new data type i forgave 
	{
		System.out.println("Int type "+x+"  "+y);
	}
	public int method(int ...marks)
	{
		int total = 0;
	    for (int mark : marks) {
	      total = total + mark;
	    }
	    System.out.println(total);
	    return total;
	}
	public static void main(String[] args)
	{
		CognizentOverloadingQu cc=new CognizentOverloadingQu();
		cc.method(10, 20);
		cc.method(10,30);
		cc.method(10,10,30);	
	}
}




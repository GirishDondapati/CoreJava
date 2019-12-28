package com.girish.interfaceex;
interface Inter
{
	int i = 20;
}
class Abcd implements Inter
{
	static int  i = 30;	
}
public class Test extends Abcd
{
	public static void main(String[] args) 
	{
		
		System.out.println(i);
		/*A oa=new TestCallForInterMethod();
		oa.a();
		oa.b();
		oa.c();
		TestCallForInterMethod tss=new TestCallForInterMethod();
		tss.d();
		AbstactB ob =new TestCallForInterMethod();
		ob.d();
		ob.c();*/
	
	}

}

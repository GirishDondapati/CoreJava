package com.girish.InterviewQues;
class A
{
	 void read()
	 {
		 System.out.println("read A");
	 }
	 
	 void write()
	 {
		 System.out.println("write A");
	 }
}

class B extends A
{
	 void read()
	 {
		 System.out.println("read B");
	 }
	 
	 void write()
	 {
		 super.read();
		 System.out.println("write B");
	 }
}


public class ExtwndsTwo extends B
{	
	
		 void sai()
		 {
			 super.write();
		 }
	
	
	public static void main(String[] args)
	{
		ExtwndsTwo t=new ExtwndsTwo();
			t.sai();
			
	}

}

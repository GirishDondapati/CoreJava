package com.girish.hcl;
/*
 * Interviewer asked me we have to  create object by using sub class reference create 
 * super class object 
 * Ans is not possible
 * but by using class casting it accept at compaile time but if we run that program
 * it throws ClassCastExcepion 
 * 
 * 
 */
class Tsss
{
	public void m1()
	{
		System.out.println("m1 method from  parent class");
	}
}
public class YusafClassObjectCreationQue extends Tsss
{
	public void m1()
	{
		System.out.println("m1 method from  child class overr class");
	}
	public void m2()
	{
		System.out.println("m2 method from  chaild class");
	}
	
	public static void main(String[] args) {
		/*YusafClassObjectCreationQue ob=(YusafClassObjectCreationQue)new Tsss();
		ob.m1();
		ob.m2();*/
		//anthor way is
		Tsss ob1=new YusafClassObjectCreationQue();
		YusafClassObjectCreationQue ob2=(YusafClassObjectCreationQue)ob1;
		ob2.m1();
		ob2.m2();//here we can't get m2() method by using ob1 object reference
		
		//Above code accepted but directly we can't create with subclass referece 
		//super class object
	}

}

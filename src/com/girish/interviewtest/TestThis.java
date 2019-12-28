package com.girish.interviewtest;

class TestThis 
{
	int i;
	String name;
	//TestThis(int i,String name)
	TestThis(int a,String name1)
	{
		//i=i;
		//name=name;
		this.i=a;
		this.name=name1;
		/*i=a;
		name=name1;*/
	}
	void display()
	{
		System.out.println(i+"  " +name);
	}
	public static void main(String[] args) 
	{
		TestThis tt=new TestThis(1,"girish");
		TestThis tt1=new TestThis(11,"ramesh");
		tt.display();
		tt1.display();
	}
}

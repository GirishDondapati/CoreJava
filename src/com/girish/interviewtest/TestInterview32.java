package com.girish.interviewtest;

class Test32
{
	
	public Test32(){
		
	}
	//polaris
	public Test32(int i)
	{
		System.out.println(i);		
	}
}

public class TestInterview32  extends Test32{

	/*public TestInterview32(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}*/
	static Test32 t1=new Test32(1);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test32 t1=new Test32(2);
		Test32 t2=new Test32(3);
		
	}
	static Test32 t4=new Test32(4);

}

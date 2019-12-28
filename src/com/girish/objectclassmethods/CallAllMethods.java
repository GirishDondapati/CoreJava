package com.girish.objectclassmethods;

public class CallAllMethods implements Cloneable {

	int x=10;
	int y;
	static int z;
	static
	{	z=30;
		System.out.println("static block");
	}
	public CallAllMethods()
	{
		y=20;
		System.out.println("COnstructor block");
		
	}
	public void mymethod()
	{
		System.out.println(x+"  "+y+"  "+z);
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		CallAllMethods cam=new CallAllMethods();
		CallAllMethods cam1;
		try {
			cam1 = (CallAllMethods) cam.clone();
			System.out.println(cam1.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cam.mymethod();
		//Object obj=(Object)cam.clone();
		System.out.println(cam.getClass());
		System.out.println(cam.hashCode());
		System.out.println(cam.toString());
		

	}

}

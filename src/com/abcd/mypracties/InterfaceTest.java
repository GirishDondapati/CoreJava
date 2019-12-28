package com.abcd.mypracties;

public class InterfaceTest implements First,Second
{
	@Override
	public void m1()
	{
		//Here both interface contain same method is m1, So we can override one method it satisfy both interfaces
		System.out.println("m1 method");
	}
	
	
	public void m2() {
		//Here both interface contain m2 same methods but parameters are different so we can must
		//overload both method in our implemented class ok
		System.out.println("First inteface m2 method");
	}

	
	public void m2(int y) {
		
		System.out.println("Second iterface m2 parameterize method: "+y);
		
	}
	
	/*public void m3() {
		
		//Same methods in both interfaces but return types are different so we can't override this method
		//it shows run time error "Unresolved compilation problem:" 
		System.out.println("same method name m3 but return type is different");
		
	}*/
	
	public static void main(String[] args) 
	{
		//System.out.println(x);//The field x is ambiguous error will rise
		System.out.println(First.x);// Solve the above problem provide this possibility
		System.out.println(Second.x);
		InterfaceTest it=new InterfaceTest();
		it.m1();
		it.m2();
		it.m2(200);
		//it.m3();
	}	

}

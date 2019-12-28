package com.girish.staticex;

public class StaticRealTimeUsing
{
	public static final int A = 2;
	public static final int B; 
	public static int C;
	//note that it is not 􀃆 public static final int B = null;
	//note that since B is final, it can be initialized only once.
	//Static initializer block, which is executed only once when the class is loaded.
	static {
	if(A == 5)
	B = 10;
	else
	C = 5;	//B=2;//here also we use the B ok other wise it gives compile time error
	
	}
	public StaticRealTimeUsing(){} //constructor is called only after static initializer block

}

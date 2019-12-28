package com.girish.innerclass;
class Showable {
	void show()
	{
		System.out.println("outer class show method");
	}

	interface Message {
		void msg();
	}
}

public class NestedInterfaceEx extends Showable implements Showable.Message  {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		Showable.Message message = new NestedInterfaceEx();// upcasting here
		message.msg();
	}

	@Override
	public void show() {
		System.out.println("outside interface method overrided");
		
	}

}


//nested class inside a interface
/*interface Showable {
	class A23
	{
		void m1()
		{
			System.out.println("M1 method inside nestes class in interface");
		}
	}
}

public class NestedInterfaceEx extends Showable.A23 {
	public void msg() {
		System.out.println("Hello nested interface");
	}
	public static void main(String args[]) {
		NestedInterfaceEx a=new NestedInterfaceEx();
		a.m1();
		a.msg();
	}
}
*/


//Nested Interface inside a interface
/*interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

public class NestedInterfaceEx implements Showable.Message,Showable {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		Showable.Message message = new NestedInterfaceEx();// upcasting here
		message.msg();
	}

	@Override
	public void show() {
		System.out.println("outside interface method overrided");
		
	}

}*/

package com.girish.AccessModifiers;

import java.lang.reflect.Method;

class a
{
	private int data=10;
	private void msg(int x)
	{
		System.out.println("This is msg() method  "+x);
	}
	
}

public class PrivateEx extends a{

	
	/*public static void main(String[] args)
	{
		PrivateEx p=new PrivateEx();
		a oa=new a();
		System.out.println(data);
		p.msg();

	}*/

public static void main(String args[])throws Exception{  
Class c=a.class;  
Object obj=c.newInstance();  
  
Method m=c.getDeclaredMethod("msg",new Class[]{int.class});  
m.setAccessible(true);  
m.invoke(obj,4);  
}

}

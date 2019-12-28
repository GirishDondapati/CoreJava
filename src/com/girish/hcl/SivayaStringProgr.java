package com.girish.hcl;

import java.util.Collections;

public class SivayaStringProgr 
{
	
	private int a;
	private String str;
	private float sal;
	
	public SivayaStringProgr(int a, String str,float sal)
	{	
		this.a=a;
		this.str=str;
		this.sal=sal;	
		//System.out.println(a+" "+str+" "+sal);
	}
	public float getSal()
	{
		return sal;
	}
	public boolean equals(Object o)
	{
		//madhu given code
		return (o instanceof SivayaStringProgr && ((SivayaStringProgr)o).sal==sal);
		/*if((o instanceof SivayaStringProgr)&&((SivayaStringProgr)o).getSal()==this.sal)
		{
			return true;
		}
		else 
		{
			return false;
		}*/
	}
	public static void main(String[] args) 
	{
		SivayaStringProgr s=new SivayaStringProgr(1,"girish",20000);
		SivayaStringProgr s1=new SivayaStringProgr(1,"girish",20000);
		if(s==s1)
		{
			System.out.println("== is true");
		}
		else if(s.equals(s1))
		{
			System.out.println("equal is true");
		}
		else
		{
			System.out.println(" else is executed");
		}
	

	}

}

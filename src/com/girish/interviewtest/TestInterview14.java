package com.girish.interviewtest;

import java.util.Vector;

public class TestInterview14 {
	private void changeVector(Vector v)
	{
		v.addElement("two");
		v=null;
	}

	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		TestInterview14 t=new TestInterview14();
		v1.addElement("one");
		t.changeVector(v1);
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
	}

}

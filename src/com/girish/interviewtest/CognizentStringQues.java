package com.girish.interviewtest;

public class CognizentStringQues implements Cloneable {
	int i=10;
	public static void main(String[] args)
	{
		String str=new String("Abc");
		String str1=str;
		String str2=new String(str1);//in string class following methods are override 1)toString(),2)equals(),3)hashCode()
		System.out.println(str1.codePointAt(0));
		System.out.println(str==str1);
		System.out.println(str1==str2);
		System.out.println(str==str2);
		System.out.println(str.equals(str1));
		
		/*System.out.println(str.hashCode());//System.out.println(str.hashCode(str1)); it shows error why means hash code 
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());*/
		
		/*CognizentStringQues obj1=new CognizentStringQues();
		
		try {
			CognizentStringQues obj3=(CognizentStringQues) obj1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CognizentStringQues obj2=new CognizentStringQues();
		
		System.out.println(obj1==obj2);
		
		System.out.println(str.equals(str1));
		System.out.println(obj1.equals(obj2));
		
		System.out.println(str.toString());
		System.out.println(obj1.toString());
		String s="a";
		System.out.println(obj1.hashCode());
System.out.println();

Object o=new Object(); 




	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CognizentStringQues other = (CognizentStringQues) obj;
		if (i != other.i)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CognizentStringQues [i=" + i + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	*/

}}

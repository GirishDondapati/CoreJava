package com.girish.interviewtest;

public class TekSystemsMethodDiff 
{
	static int m(int i)
	{
		System.out.println(i+" ");
		return i;
	}

	public static void main(String[] args)
	{
		int i=1;
		m(m(++i)-m(i++)+m(-i)*m(~i));
		//m(~i); m(~i); m(++i); m(i++);  m(-i);
		
		
		int j=10;
		System.out.println(Integer.toBinaryString(j));
		System.out.println(~j);

	}

}

package com.girish.interviewtest;

public class ExceptionProblem {
	
	public static void main(String[] args) {
		SampleX obj = new SampleX();
		obj.m1();
	}
}
class SampleX
{
	public void m1() {
		try {
			throw new BaseException();
		}
		catch(ChildException ex) {
		}
	}
	
	public void m2() {
		try {
			throw new ChildException();
		}
		catch(BaseException ex) {
		}
	}
}

class BaseException extends RuntimeException  //Exception
{
	public BaseException() {
		
	}
}

class ChildException extends BaseException
{
	public ChildException() {
		
	}
}
package com.girish.hcl;

public class StackExample
{
	int capacity=10;
	int arr[]=new int[capacity];
	int top=-1;
	public void push(int i)
	{
	if(top<capacity-1)
	{
	top++;
	arr[top]=i;
	System.out.println("pushed element is"+i);
	}
	else
	{
		System.out.println("stack over flow");
	}
	}
	public void pop()
	{
		if(top>=0)
		{   
			System.out.println("deleted element is"+arr[top]);
			top--;
		}
		else
		{
			System.out.println("stack is under flow");
		}
	}
	public void printElements()
	{   
		if(top>=0)
		{
		System.out.println("stack elements are");
		for(int j=0;j<=top;j++)
		{
			System.out.println(arr[j]);
		}
		}
	}
	public static void main(String[] args) {
		StackExample s=new StackExample();
		s.push(10);
		s.push(45);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		s.printElements();	
	}
}
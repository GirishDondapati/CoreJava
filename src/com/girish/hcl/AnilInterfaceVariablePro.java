package com.girish.hcl;

interface A
{
	int a=10;
	void show();
}
interface B
{
	int a=20;
	void show();
}
public class AnilInterfaceVariablePro implements A,B
{
	//int a=30;
	public static void main(String[] args) {
		AnilInterfaceVariablePro oa=new AnilInterfaceVariablePro();
		//System.out.println(oa.a);//The field oa.a is ambiguous
		oa.show();
	}

	@Override
	public void show() {
		System.out.println("Show method called");
		
	}

}

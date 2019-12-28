package com.girish.hcl;
interface A12
{
	int x=10;
	void show();
	void show(int a, int b);
}
public class AnilClassLevelVariablePro implements A12{

	int a=10;
	public static void main(String[] args) {
		A12 pro=new AnilClassLevelVariablePro();
		//System.out.println(pro.a);//a cannot be resolved or is not a field
		//System.out.println(x);
		pro.show(10, 20);
	}

	@Override
	public void show() {
		System.out.println("Show method with out parameters");
		
	}

	@Override
	public void show(int a, int b) {
	
		System.out.println("Show method with parameters: "+(a+b));
	}

}

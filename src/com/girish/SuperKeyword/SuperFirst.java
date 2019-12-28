package com.girish.SuperKeyword;
//super is used to refer parent class instance variable
class Vehicle
{
	int speed=50;
}
public class SuperFirst extends Vehicle 
{
	int speed=100;
	void display()
	{
		System.out.println("parent variable:"+super.speed);
		System.out.println("Insatant variable"+this.speed);
		System.out.println(speed);
		
	}
	
	public static void main(String[] args) {
		SuperFirst sf=new SuperFirst();
		sf.display();
	}

}

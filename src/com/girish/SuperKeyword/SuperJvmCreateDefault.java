package com.girish.SuperKeyword;
class Vehicle2
{
	public Vehicle2() 
	{
		System.out.println("vehecle is created");
	}
}
public class SuperJvmCreateDefault extends Vehicle2 
{
	int speed;
	public SuperJvmCreateDefault(int speed)
	{
		this.speed=speed;
		System.out.println(speed);
	}
	public static void main(String[] args)
	{
		SuperJvmCreateDefault sjcd=new SuperJvmCreateDefault(10);

	}

}

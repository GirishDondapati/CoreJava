package com.girish.designpattrens;

public class FactoryPattrenEx {

	/**
	 * Date 03-11-2014 7:30AM
	 * 
	 *		 Abstract Factory patterns works around a super-factory which creates 
	 * other factories. This factory is also called as Factory of factories. 
	 * This type of design pattern comes under creational pattern as this
	 *  pattern provides one of the best ways to create an object.
	 *  	In Abstract Factory pattern an interface is responsible for 
	 *  creating a factory of related objects, without explicitly specifying 
	 *  their classes. Each generated factory can give the objects as per 
	 *  the Factory pattern.
	 * 
	 */
	public static void main(String[] args) 
	{
		FactoryPattrenObject fpo=new FactoryPattrenObject();
		
		Shape shape1=fpo.getShape("circle");
		shape1.draw();
		Shape shape2=fpo.getShape("recTANGLE");
		shape2.draw();
		Shape shape3=fpo.getShape("Squre");
		shape3.draw();
		
	}

}

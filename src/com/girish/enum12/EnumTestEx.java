package com.girish.enum12;

enum WeekDays
{
	Mon,Thus,Wed,Thurs,Fri,Sat,Sun
}
public class EnumTestEx {

	public static void main(String[] args) {
		WeekDays obj = WeekDays.Mon;
		System.out.println(obj);
		System.out.println(obj.hashCode());
		obj = WeekDays.Sat;
		System.out.println(obj);
		System.out.println(obj.hashCode());
		WeekDays obj1 = WeekDays.Sat;
		System.out.println(obj1);
		System.out.println(obj1.hashCode());
	}

}

/*
 
 1) 
 
 */

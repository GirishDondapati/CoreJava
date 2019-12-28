package com.girish.enum12;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

enum Direction  {
	// Enum types
	EAST(0), WEST(180), NORTH(90), SOUTH(270);

	// Constructor
	private Direction(final int angle) {
		this.angle = angle;
	}

	// Internal state
	private int angle;

	public int getAngle() {
		return angle;
	}
}
public class Level
{
 Level() {
		// TODO Auto-generated constructor stub
	}
 final static int a=10;

 public static void main(String[] args)
 {
	 //Keys can be only of type Direction
	 Map enumMap = new EnumMap(Direction.class);

	//Populate the Map
	 enumMap.put(Direction.EAST, Direction.EAST.getAngle());
	 enumMap.put(Direction.WEST, Direction.WEST.getAngle());
	 enumMap.put(Direction.NORTH, Direction.NORTH.getAngle());
	 enumMap.put(Direction.SOUTH, Direction.SOUTH.getAngle());
	 System.out.println(enumMap);
 }
 
 /*public static void main(String[] args) {
	 Set enumSet = EnumSet.of(	Direction.EAST,
							Direction.WEST,
							Direction.NORTH,
							Direction.SOUTH
						);
 }*/
 
 /*public static void main(String[] args) {
		
		int t=Direction.EAst.getAngle();
		System.out.println(t);
		
		Direction usCoin = Direction.valueOf("EAST");
		System.out.println(usCoin);
		if(usCoin == Direction.WEST){
		  System.out.println("enum in java can be compared using ==");
		}
		
		Direction usCoin1 = Direction.SOUTH;
	    switch (a) {
	            case 30:
	                    System.out.println("Penny coin");
	                    break;
	            case 20:
	                    System.out.println("Nickle coin");
	                    break;
	            
	            case 10:
	                    System.out.println("Dime coin");
	                    break;
	            case 40:
	                    System.out.println("Quarter coin");
	                    break;
	    }
	  

	}*/
}
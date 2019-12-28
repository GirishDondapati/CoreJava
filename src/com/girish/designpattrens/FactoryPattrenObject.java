package com.girish.designpattrens;

public class FactoryPattrenObject 
{
	public Shape getShape(String shape)
	{
		if(shape==null)
		{
			return null;
		}
		else if(shape.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("SQURE"))
		{
			return new Squire();
		}
		else
			return null;
	}

}

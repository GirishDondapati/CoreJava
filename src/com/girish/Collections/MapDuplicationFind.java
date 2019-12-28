package com.girish.Collections;

public class MapDuplicationFind
{
	int id;
	String value;
	public MapDuplicationFind(int a,String b)
	{
		this.id=a;
		this.value=b;
		
	}
	public int compareTo(Object obj)
	{
		MapDuplicationFind mdp=(MapDuplicationFind)obj;
		if(id==mdp.id)
			return 0;
		else
			if(id>mdp.id)
				return 1;
			else
				return -1;
	}
}

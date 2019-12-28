package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*public class Athenahealth100CircleProgram
{
	public static void main(String[] args) throws Exception
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter eny one number: ");
	   int pp=sc.nextInt();
	   ArrayList al=new ArrayList();
	   for(int i=1;i<=pp;i++)
	   {
		   al.add(i);
	   }
	   System.out.println("The list of number: "+al);
	  // System.out.println(survive(al));
	   System.out.println(survive1(al));
	}
	
	private static int survive1(ArrayList al)
	{
		int i = 1;
		boolean check = true;
		
		while(al.size() > 1)
		{
			System.out.println("Size: "+al.size()+" i : "+i);
			System.out.println(al +"   check: "+check);
			if(check)
			{
				if(i == al.size()-1)
				{
					System.out.println("->"+al.remove(i));
					i = 1;
					check = false;
					continue;
				}
				else
				{
					System.out.println("-->"+al.remove(i));
					i++;
					check = false;
					continue;
				}
			}
			else
			{
				if(i == al.size())
					i = 0;
				
				check = true;
			}
		}
		return (Integer)al.get(0);
	}

	private static int survive(ArrayList al) 
	{
		ArrayList all=al;
		int index=0;
		while(al.size()>1)
		{
			if(index<all.size())
			{
				if((index+1)>=al.size())
				{
					index = 0;
					all.remove(index);
					continue;
				}
				all.remove(index+1);
				index =index+1;
				continue;
			}
			else
			{
				index = 0;
				if((index+1)>=all.size())
				{
					index = 1;
					all.remove(index);
					continue;
				}
				continue;
			}
		}
		return (Integer)all.get(0);
	}
	
}*/

/*
 * Code 100 peoples standing in a circle with one sword puzzle.
 * 
 * @author  Girish.D
 */
public class Athenahealth100CircleProgram
{
	//It was working fine
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please specify number of person palying game: ");
		int totalNo = sc.nextInt();
		
		if(totalNo <= 0)
		{
			System.out.println("No person available for play game. Please increase persion");
			return;
		}
		else if(totalNo == 1)
		{
			System.out.println("Only one person only playing. So survied person is: "+totalNo);
			return;
		}
		ArrayList<Integer> al = (ArrayList<Integer>) getListOfPersions(totalNo);
		int survivePersion = getFinalSurvivePerson(al);
		System.out.println("Out of "+totalNo+" persons, survived person is: "+survivePersion+" person.");		
	}
	
	public static List<Integer> getListOfPersions(int totNoOfPersions)
	{
		List<Integer> totPeoples = new ArrayList<Integer>();
		for (int i = 1 ; i <= totNoOfPersions ; i++)
		{
			totPeoples.add(i);
		}
		return totPeoples;
	}
	
	public static int getFinalSurvivePerson(ArrayList<Integer> personsList)
	{
		for(int i = 1; i < personsList.size(); ++i)
		{
			if(personsList.size() == 1)
				break;
			
			if(i == personsList.size()-1)
			{
				personsList.remove(i);
				i = 0;
			}
			else
			{
				personsList.remove(i);
				if((i+1) == personsList.size())
				{
					personsList.remove(0);
					i=0;
					continue;
				}
			}
		}
		return personsList.get(0);
	}
}


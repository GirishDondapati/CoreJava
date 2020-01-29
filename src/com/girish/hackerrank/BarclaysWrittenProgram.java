package com.girish.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * You are given M number of coins and P number of notes.

Write a program to separate the two forms of money without creating two separate classes for notes and coins.

(The order of the output should be the same as that of the input).

Input format

First line : N
Next N lines : Space-separated string S and an integer  (where S is either a Coin or a Note and  denotes the denomination of a coin or a note)
Output format
Print the string Coins : followed by M lines, each of which contains an integer denoting the denominations of the coins.
Print the string Notes : followed by P lines, each of which contains an integer denoting the denominations of the notes.

Constraints


Description of Classes:

You need to design 3 classes:

Bag
Coin
Note
Note and Coin Class
Both the classes have common attributes as well as common methods.

Attributes:
Val: refers to the denomination of the coin or note

Methods:
setvalue(int val): Set the denomination of the coin to the value which is passed as a parameter.

Bag Class
This should be a generic class.

Methods
add(Type t): Add the coin or note to the bag.
Display(): Display the denomination of the coin or note.

SAMPLE INPUT 
7
Note 83
Coin 19
Coin 85
Note 8
Note 30
Coin 56
Coin 53
SAMPLE OUTPUT 
Coins :
19
85
56
53
Notes :
83
8
30
 *
 */


public class BarclaysWrittenProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,val=0;
		String str="";
		
		n= sc.nextInt();
		Bag<Coin> bagOfCoins = new Bag<Coin>();
		Bag<Note> bagOfNotes = new Bag<Note>();
		for(int i = 0; i<n;i++)
		{
			str = sc.next();
			val=sc.nextInt();
			
			switch(str)
			{
			case "Coin":
				Coin coin = new Coin();
				coin.setValue(val);
				bagOfCoins.add(coin);
				break;
			case "Note":
				Note note = new Note();
				note.setValue(val);
				bagOfNotes.add(note);
				break;
			}
		}
		System.out.println("Coins :");
		bagOfCoins.display();
		System.out.println("Notes :");
		bagOfNotes.display();
	}
}
class Bag<E>
{
	List allList = new ArrayList();
	public void add(Object obj)
	{
		allList.add(obj);
	}
	
	public void display()
	{
		for(int i = 0; i < allList.size(); i++)
		{
			Object obj = allList.get(i);
			if(obj instanceof Coin)
				System.out.println(((Coin) obj).getValue());
			if(obj instanceof Note)
				System.out.println(((Note) obj).getValue());
			
		}
	}
}
class Coin
{
	private int val;
	public void setValue(int val)
	{
		this.val = val;
	}
	public int getValue()
	{
		return this.val;
	}
}

class Note
{
	private int val;
	public void setValue(int val)
	{
		this.val = val;
	}
	public int getValue()
	{
		return this.val;
	}
}

/*public class BarclaysWrittenProgram {
	public static void func(Number n)
	{
		System.out.println("Number Function");
	}
	public static void func(Integer n)
	{
		System.out.println("Integer Function");
	}public static void func(String n)
	{
		System.out.println("String Function");
	}public static void func(Float n)
	{
		System.out.println("Float Function");
	}public static void func(int... n)
	{
		System.out.println("int args Function");
	}
	public static void main(String[] args) {
		int i = 10;
		func(i);	
	}
}*/



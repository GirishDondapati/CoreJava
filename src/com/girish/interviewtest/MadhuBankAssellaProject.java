package com.girish.interviewtest;

import java.util.Hashtable;
import java.util.Scanner;

public class MadhuBankAssellaProject
{
	Hashtable trainTicketsHash = new Hashtable();
		
	public static void main(String[] args)
	{
		
		while (true)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Please select below opptions \n 1) Ticket Booking \n 2) Ticket Cancilation \n 3) Check Ticket Details");
			int selectedNo = sc.nextInt();
			
			if(selectedNo == 1) //Ticket Booking
			{
				
			}
			else if(selectedNo == 2)
			{
				
			}
			else if(selectedNo == 3)
			{
				
			}
			else
			{
				
				try 
				{
					throw new InvalidOption("Please enter currect option");
					continue;
				}
				catch (InvalidOption e) {
					continue;
				}
			}
		}
	}
}

class InvalidOption extends Exception
{
	public InvalidOption(String string)
	{
		super();
	}
}


package com.girish.FromHari;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class ConsoleReaderWays
{
	public static void main(String[] args) throws Exception
	{
		/*
		 	Approches to read or take dynamic data from console or command fromt.
		 	1) BufferReader,
		 	2) Scanner,
		 	3) Console. By using this tree classes we can read data from console.
		 */
		
		// 1) Using BufferReader class
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter name: ");
		String name = br.readLine();
		System.out.println("Please enter your age: ");
		String age = br.readLine();
		System.out.println(name+ " "+age);
		int read = br.read();// It will read character by character and return to ascii value
		System.out.println(read); //reaad value u enter ex:-11 it will return 48(ASCII value)
		
		/*
		 	Drawbacks: If we have to enter Integer or double or float we have to enter string type and
		 	convert to what type u want.
		 	Ex:
		 	 String age = br.readLine();
		 	 int noAge = Integer.parseInt(age);
		 	 Like that we have to do.
		 */
		
		// 2) Using Scanner class (Jdk 1.5 feature)
		
		
		// 3) Using Console class
		
		Console consoleObj = System.console();
		
		
		
	}
}

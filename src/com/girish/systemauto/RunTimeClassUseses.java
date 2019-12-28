package com.girish.systemauto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunTimeClassUseses {

	 public static void main(String args[])throws Exception
	 {  
		 int i = 1;
		 while(i < 6)
		 {
			 i++;
			 Thread.sleep(2000);
			 System.out.println("Thread slep");
			 if(i == 5)
			 {
				 System.out.println("Sys going to shut down");
				 Thread.sleep(3000);
				 Runtime.getRuntime().exec("shutdown -s -t 0");  
			 }
		 }
	 }  
	// It will read all running processes
	/*public static void main(String args[]) throws Exception
	{
		Process p = Runtime.getRuntime().exec("tasklist");
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while((line = reader.readLine()) != null) 
		{
			System.out.println(line);
			if (line.indexOf("notepad.exe") > -1)
			{
				Runtime.getRuntime().exec("taskkill /F /IM notepad.exe");
				System.out.println("success");
			}
			else if(line.indexOf("FreemakeVD.exe") > -1)
			{
				Runtime.getRuntime().exec("taskkill /F /IM FreemakeVD.exe");
				System.out.println("success");
			}
			else if(line.indexOf("editplus.exe") > -1)
			{
				Runtime.getRuntime().exec("taskkill /F /IM editplus.exe");
				System.out.println("success");
			}
		}
	}*/
	
	// It will open Notepad
	/*public static void main(String args[]) throws Exception {
		Runtime.getRuntime().exec("notepad");// will open a new notepad
	}*/
}

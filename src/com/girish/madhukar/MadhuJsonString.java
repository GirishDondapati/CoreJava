package com.girish.madhukar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class MadhuJsonString 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("E:\\JAVA\\MadhuText.txt");
		Scanner sc=new Scanner(f);
        while(sc.hasNextLine())
        {
        	String str = sc.nextLine();
            System.out.println("Input Str: "+str);
            
            str = str.replace("\"", "\\\"");
            System.out.println("Output: "+str);
        }
	}
}

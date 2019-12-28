package com.girish.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutput 
{
 
	public static void main(String[] args) throws IOException
	{
		int i=0;
		FileInputStream fis=new FileInputStream("F://Programs//a11.java");
		FileOutputStream fos=new FileOutputStream("F://Programs//a11.java");
		String str="hi this FOS in a11.java";
		byte b[]=str.getBytes();
		fos.write(b);
		
		System.out.println(" FOS success");
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
			fos.write((char)i);
		}
		fis.close();
		fos.close();

	}

}

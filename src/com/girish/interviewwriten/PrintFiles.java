package com.girish.interviewwriten;

import java.io.File;

public class PrintFiles
{
	public static void main(String args[])
	{
		File f=new File("F:/girish1");
		String[] file=f.list();
		for(int i=0;i<file.length-1;i++)
		{
			System.out.println(file[i]);
		}
	}

}

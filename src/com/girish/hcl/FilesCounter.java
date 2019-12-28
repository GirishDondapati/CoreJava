package com.girish.hcl;

import java.util.*;
import java.io.*;
class FilesCounter
{	
	static ArrayList<String> FileExtensions = new ArrayList<String>();
	static Vector<Integer> FileExtensionsCount = new Vector<Integer>();
	
	public static void main(String args[])
	{
		String folderPath = args[0];
		File f=new File(folderPath);
		searchFilesForFolder(f);
		//displaying final results
		System.out.println("File Extension\tFiles Count\n");

		System.out.println(FileExtensionsCount.size());
		for(int i=0; i<FileExtensions.size(); i++)
		{
			System.out.println(FileExtensions.get(i)+ "\t\t"+FileExtensionsCount.get(i));
		}
	}
	
	public static void searchFilesForFolder(File folder) 
	{
		String temp;
		String temp_extension;
		for (File fileEntry : folder.listFiles()) 
		{
		  if (fileEntry.isDirectory()) 
		  {
			searchFilesForFolder(fileEntry);
		  }
		  else 
		  {
			if (fileEntry.isFile()) 
			{
				  temp = fileEntry.getName();
				  //getting the extension
				  temp_extension = temp.substring(temp.lastIndexOf('.') + 1, temp.length()).toLowerCase();
				  addExtensionToListIfNewAndGetIndexPosition(temp_extension);
				
			}

		  }
		}
	  }
	  
	  public static void addExtensionToListIfNewAndGetIndexPosition(String extension)
	  {
		  int i=0;
		Boolean isExtensionExisted = false;
		for(i = 0; i < FileExtensions.size(); i++)
		{
			if(FileExtensions.get(i).toLowerCase().equals(extension))
			{
				isExtensionExisted = true;	
				Integer p=FileExtensionsCount.get(i);
							FileExtensionsCount.set(i,++p);
				break;
			}
		}
		
		if(isExtensionExisted == false)
		{
			FileExtensions.add(extension);
			FileExtensionsCount.add(1);
		}
	  }
	  
	
  }
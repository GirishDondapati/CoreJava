package com.girish.InterviewQues;

import java.io.FileInputStream;
import java.io.IOException;

public class NotepadTextWords 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			int ch;
			FileInputStream fin = new FileInputStream("C:/Users/Girish/Desktop/girish.txt");
			StringBuffer bf=new StringBuffer("");
			while ((ch=fin.read())!=-1) 
			{
				bf.append((char) ch);
			}
			String str=new String(bf);
			System.out.println(str);
			String str1[]=str.split(" ");
			int length = str1.length;
			System.out.println(length);
			int i=0;
			
			while (i <=length-1) 
			{
				String str2=new String(str1[i]);
				//System.out.println(str2);
				int count = 0, j = 0;
				while (j <=length-1) 
				{
					String str3=new String(str1[j]);
					//System.out.println(str3);
					
					if (str2.equals(str3))
					{
						count++;
					}
					j++;
				}
				String dd=str2;
				StringBuffer s=new StringBuffer("");
				if(!s.toString().contentEquals(dd))
				{
					s=s.append(str2);
					System.out.println("Auccerance of  '" +str2 + " ' is "+ count);
					
				}
				
				i++;
			}
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}

		
		//System.out.println("Given String is : "+str+" :  length is "+str.length());
	}		

}

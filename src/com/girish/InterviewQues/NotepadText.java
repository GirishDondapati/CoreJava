package com.girish.InterviewQues;

import java.io.FileInputStream;
import java.io.IOException;

public class NotepadText 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			int ch;
			FileInputStream fin = new FileInputStream("e:/text.txt");
			StringBuffer bf=new StringBuffer("");
			while ((ch=fin.read())!=-1) 
			{
				bf.append((char) ch);
			}
			
			int length = bf.length() - 1;
			int i=0;
			StringBuffer s=new StringBuffer();
			while (i <=length) 
			{
				int count = 0, j = 0;
				while (j <=length) 
				{
					if (bf.charAt(i) == bf.charAt(j))
					{
						count++;
					}
					j++;
				}
				String dd=Character.toString(bf.charAt(i));
				if(!s.toString().contains(dd))
				{
					s=s.append(bf.charAt(i));
					System.out.println("Auccerance of  '" + bf.charAt(i) + " ' is "+ count);
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

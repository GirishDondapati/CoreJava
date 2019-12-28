package com.girish.String;

public class StringReverseWithOutUsingAPI
{
	public static void main(String[] args)
	{
		 String str="Java 2 career";
	     String arr[]=str.split(" ");
	     System.out.print("Given String is"+str+" Reverse is:");
	     for(int i=arr.length-1;i>=0;i--)
	     {
            char temp[]=arr[i].toCharArray();
            for(int j=temp.length-1;j>=0;j--)
            {
                System.out.print(temp[j]);

            }
            System.out.print(" ");
	      }

	}

}

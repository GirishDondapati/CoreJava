package com.girish.String;

public class HarishStringDuplicateChar3Removing
{
	static boolean succesFlag = true;
	
	public static void main(String[] args) {	
		String str = "abbcccbddffeeef";
		char charArr[] = str.toCharArray();
		char outString[] = null;
		while(succesFlag)
		{
			outString = checkCharacters(charArr);  //aaabbaaabaaa
		}
	}
	
	
	public static char[] checkCharacters(char[] ch)
	{
		
		for(int i = 0; i < ch.length - 3; i++)
		{
			char eachChar = ch[i];
			if(eachChar == ch[i + 1])
			{
				if(eachChar == ch[i + 2])
				{
					if(eachChar == ch[i + 3])
					{
						ch[i] = ' ';
						
					}
				}
			}
			
		}
		return ch;
	}
	

}

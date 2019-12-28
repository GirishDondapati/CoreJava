package com.girish.interviewtest;

public class JoshBlochExplanetion
{
	static boolean yesOrNo(String s)
	{
		s = s.toLowerCase();
		if(s.equals("yes") || s.equals("y") || s.equals("s"))
			s = "true";
		//return Boolean.getBoolean(s); // It will return false false
		return Boolean.parseBoolean(s); // It will retun true true
	}
/*	public static void main(String[] args)
	{
		System.out.println(yesOrNo("true")+"  "+yesOrNo("YeS"));
	}*/
	
	
	
		/*public static void main(String[] args) {
		System.out.println(
		Long.toHexString(0x100000000L + 0xcafebabe));
		}*/
	public static void main(String args[])
	{
		 System.out.println(2.00 - 1.10);
	}
		
	
	
	
	
	
	
	
	
	
	private static boolean toBoolean(String name)
	{
		
		System.out.println("----"+name);
        return ((name != null) && name.equalsIgnoreCase("true"));
	}
	public static boolean getBoolean(String name)
	{
        boolean result = false;
        try
        {
            result = toBoolean(System.getProperty(name));
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
        } catch (NullPointerException e) {
        }
        return result;
	}
}

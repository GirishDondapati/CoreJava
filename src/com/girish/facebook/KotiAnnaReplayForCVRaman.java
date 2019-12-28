package com.girish.facebook;

public class KotiAnnaReplayForCVRaman
{
	public static void main(String[] args) 
	{
		//Wrong Output coming for this code 
		String name = "Chandrasekhara Venkata Raman";

		System.out.println("Given Name is : " + name);

		String s[] = name.split(" ");

		StringBuffer fv = new StringBuffer();

		String rs = " ";

		for (int i = 0; i < s.length; i++) 
		{
		   rs = s[i].trim();
		   if (rs.length() != 0)
		   {
			   if (i == s.length - 1) 
			   {
				   fv.append(rs);
			   }	
			   else 
			   {
				   fv.append(rs.charAt(0));
				   fv.append(".");
			   }
		   }
		 }
		System.out.println("Results of Name is : " + fv.toString());
	}
	
}


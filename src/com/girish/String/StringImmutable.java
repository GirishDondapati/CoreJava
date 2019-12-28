package com.girish.String;

class StringImmutable
{
	public static void main(String[] args) 
	{
		//StringEx ex=new StringEx();//The constructor StringEx() is not visible
		int x=StringEx.y;//with out loading StringEx class we call the variables 
		System.out.println(x);
		StringBuffer s1=new StringBuffer("girish");
		System.out.println("StringBuffer s1 value:"+s1);
		System.out.println("StringBuffer s1 Address:"+s1.hashCode());
		//String s1="girish";
		//System.out.println("String s1 value:"+s1);		
		//System.out.println("String s1Address:"+s1.hashCode());
		StringBuffer s2=new StringBuffer("girish");
		System.out.println("StringBuffer s2 value:"+s2);
		System.out.println("StringBuffer s2 Address:"+s2.hashCode());
		s1=s1.append(s2);//StringBuffer Class +(operator) and concat() method not possible
		System.out.println("After Append:"+s1);
		System.out.println("After Append Address:"+s1.hashCode());
		//String s2="naidu";
		//System.out.println("String s2 value:"+s2);
		//System.out.println("String s2Address:"+s2.hashCode());
		//s1=s1.concat(s2);//or s1=s1+s2;
		//System.out.println("After concating:"+s1);
		//System.out.println("After concating Address:"+s1.hashCode());
		int[] array={1,2,3};
		OwnImmutableClass oic=new OwnImmutableClass(array);
		System.out.println(oic);
		array[1]=5;
		System.out.println(oic);
		String str="abc";
		str.charAt(1);
	}
}

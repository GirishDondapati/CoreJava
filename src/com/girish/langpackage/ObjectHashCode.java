package com.girish.langpackage;

/*
 * 1) for every object jvm will create one unique id that is called haseCode 
 * 2) jvm will uses hase code will saving object into hashtable or hashset or hashmap
 * 3) Based on requirement we can generate hashcode by overriding hashcode method in our class
 * 
 */
public class ObjectHashCode {
	int i;
	public ObjectHashCode(int i) 
	{
		this.i=i;
	}
	/*public String toString()
	{
		return "Hi this is"+"@ "+i;
	}*/
	public int hashCode()
	{
		return i;
	}

	public static void main(String[] args) 
	{
		ObjectHashCode o=new ObjectHashCode(11);
		ObjectHashCode o1=new ObjectHashCode(100);
		System.out.println(o);//com.girish.langpackage.ObjectHashCode@b
		System.out.println(o1);//com.girish.langpackage.ObjectHashCode@64
		
		
	}

}

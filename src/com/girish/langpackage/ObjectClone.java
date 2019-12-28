package com.girish.langpackage;
/*
 * 1) The process of creating exactly duplicate object is called cloning
 * 2) The main objective of cloning is to maintain backup
 */
public class ObjectClone implements Cloneable {
	int x=10;
	int y=20;
	

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		ObjectClone o=new ObjectClone();
		ObjectClone o1=(ObjectClone)o.clone();
		o1.x=888;
		o1.y=999;
		System.out.println(o.x+"  "+o.y);
		System.out.println(o.hashCode()==o1.hashCode());//false
		System.out.println(o==o1);//false
	

	}

}

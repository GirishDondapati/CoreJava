package com.girish.hcl;
/*
 * Interview Lady date; 13-10-2014
 * 
 * She was asked me the following Questions
 * 1) In person class contains id name fields, So we have take person class 
 * key ans his salary has values. so if we enter same name and  id that salary 
 * what to override 
 * 
 * after that finding time if i enter name and id it display his salary
 * 
 * 2) Print duplicate objects in given array with count
 * 3) She asked me Excptions like if super class method throws Checked exception
 *     in sub class what type of Excption we can throw 
 *     In super class method if doesn't throws any exception on that time 
 *     what what exception we throws in sub class overrided method  
 */
class Person
{
	String s=null;
}
public class LadyInterPersionClassWithoutDupliInHashMap implements Cloneable
{

	
	public static void main(String[] args) throws CloneNotSupportedException {
System.out.println("@@@@@@@@@@ Deep clonnig @@@@@@@@");
LadyInterPersionClassWithoutDupliInHashMap l1=new  LadyInterPersionClassWithoutDupliInHashMap();
LadyInterPersionClassWithoutDupliInHashMap l2=(LadyInterPersionClassWithoutDupliInHashMap) l1.clone();
System.out.println("l1==l2  "+(l1==l2));
System.out.println("l1.equals(l2) "+l1.equals(l2));
System.out.println("l1!=l2"+(l1!=l2));
System.out.println("l1.hashCode()==l2.hashCode() "+(l1.hashCode()==l2.hashCode()));

System.out.println("@@@@@@ shallow Clonnig @@@@@@@@");
LadyInterPersionClassWithoutDupliInHashMap l3=new  LadyInterPersionClassWithoutDupliInHashMap();
LadyInterPersionClassWithoutDupliInHashMap l4=l3;
System.out.println("l3==l4  "+(l3==l4));
System.out.println("l3.equals(l4) "+l3.equals(l4));
System.out.println("l3!=l4"+(l3!=l4));
System.out.println("l3.hashCode()==l4.hashCode() "+(l3.hashCode()==l4.hashCode()));


	}

}

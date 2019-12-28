package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Empl
{
	private String empid;
	private String ename;
	private String sal;
	
	public Empl(String empid, String ename, String sal) 
	{
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}	
}
class EmplSortBySal implements Comparator<Empl>
{

	@Override
	public int compare(Empl o1, Empl o2) 
	{
		return 0;
	}
	
}
public class ElivinTechCollectionSortingEmpData 
{
	static String str="101:name1:22000,102:name2:9842,103:name3:25600,104:name4:89932,105:name5:67200,106:name6:19842,108:name8:32000,107:name7:98042";
	static String str1[]=str.split(",");
	public static void addMethod()
	{
		List<Empl> al=new ArrayList<Empl>();
		for(int i=0;i<str1.length;i++)
		{
			String str2[]=str1[i].split(":");
			for(int j=0;j<str2.length;j+=3)
			{
				al.add(new Empl(str2[0],str2[1],str2[2]));
			}	
			Collections.sort(al,new EmplSortBySal());
		}
		
	}
	public static void printEmpl(List<Empl> empl)
	{
		for (Empl empl2 : empl) 
		{
			System.out.println("empid:"+empl2.getEmpid());
			
		}
	}
	
	public static void main(String[] args) 
	{		
		addMethod();
	}

}

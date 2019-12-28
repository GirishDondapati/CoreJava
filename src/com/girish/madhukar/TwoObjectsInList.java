package com.girish.madhukar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TwoObjectsInList {

	public static void main(String[] args) 
	{
		List<Employee> l=new LinkedList<Employee>();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter how many emp details you entered:");
		int i=sc.nextInt();
		
		for(int j=1;j<=i;j++)
		{
				System.out.println("enter emp id, ename, sal:");
				int id=sc.nextInt();
				String ename=sc.next();
				int esal=sc.nextInt();
				
				System.out.println("enter dept name, loc");
				String dname=sc.next();
				String loc=sc.next();
				Depatment depatment=new Depatment(dname,loc);
				List l11=new ArrayList();
				l11.add(depatment);
				l.add(new Employee(id,ename,esal,l11));
				
		}
		for (Employee em : l)
		{
			Depatment dd=(Depatment) em.getDepatment();
			System.out.println("emp No:"+em.getEmpno()+", emp Name:"+em.getEname()+", emp sal:"+em.getSat()+", Dept name:"+dd.getDeptname()+", dept Loc:"+dd.getLoc());
			
			
		}
		
		
		
		
		

	}

}

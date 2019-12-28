package com.girish.collectionwithbean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ArrayListEx 
{
	
	public static void main(String args[]) throws Exception
	{
		/*//Employee employee;
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "girish", 190000));
		list.add(new Employee(2, "qgirish", 150000));
		list.add(new Employee(7, "dgirish", 103000));
		list.add(new Employee(4, "ggfirish", 105000));
		list.add(new Employee(8, "tghirish", 103000));
		list.add(new Employee(6, "ngirish", 100020));
		list.add(new Employee(3, "jagirish", 100100));
		Collections.sort(list);
		TreeSet ts=new TreeSet(list);
		System.out.println(ts);
		for (Employee s : list)
		 {
		   
		   	     System.out.println(s.getEmpno()+"  "+s.getEname()+" " +s.getSal());
		  
		 }*/
		
		//Generic Example
		List<List<Integer>> table=new ArrayList<List<Integer>>();
		for(int i=0;i<=10;i++)
		{
			List<Integer> row=new ArrayList<Integer>();
			for(int j=0;j<=10;j++)
				row.add(i*j);
			table.add(row);
		}
		for (List<Integer> list : table) {
			System.out.println(list);
		}

	}

}

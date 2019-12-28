package com.girish.collectionwithbean;

import java.io.*;
import java.util.*;
public class DisplayArrayList {
 
public static void main(String[] args) throws Exception {
 
List<Employee> list = new ArrayList<Employee>();
list.add(new Employee(1, "Ravi",10000));
list.add(new Employee(2, "Raj",20000));
list.add(new Employee(3, "Rekha",10000));
list.add(new Employee(4, "Ram",20000));
System.out.println(" ");
System.out.print("Enter emp id ");
Scanner input=new Scanner(System.in);
int id = input.nextInt();
 for (Employee s : list)
 {
   if(id == s.getEmpno())
   {
    // System.out.println("<span id="IL_AD1" class="IL_AD">Name and Address</span> of employee are  ");
     System.out.print(s.getEname()+" " +s.getSal());
   }
 }
}
}
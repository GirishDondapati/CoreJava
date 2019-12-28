package com.girish.interviewtest;

class A{
   
    A(){
        System.out.println("A's no argument constructor");
    }
   
   A(String args){
       System.out.println("A's one argument constructor");
   }
}
 
class B extends A{
   
   B(){
        //this(""); // calling one arg constructor of class B
        System.out.println("B's no argument constructor");
    }
  
   B(String args){
        super(""); // calling one argument constructor of class A
        System.out.println("B's one argument constructor"+args);
    }
}
public class ThisSuperKey {
   
    public static void main(String args[]) {      
       B b1
       = new B("hi");             
       B b = new B();             
    }
 
}
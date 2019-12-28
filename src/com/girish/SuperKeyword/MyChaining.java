package com.girish.SuperKeyword;

public class MyChaining {
    
    public MyChaining(){
        System.out.println("In default constructor...");
    }
    public MyChaining(int i){
    	//super();
        this();
        System.out.println("In single parameter constructor"+i);
    }
    public MyChaining(int i,int j){
    	//super();
       this(j);
        System.out.println("In double parameter constructor"+i+"  "+j);
    }
     
    public static void main(String a[]){
        MyChaining ch = new MyChaining(10,20);
    }
}
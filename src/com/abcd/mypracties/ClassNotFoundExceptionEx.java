package com.abcd.mypracties;

public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
		//Classes are statically loaded with Java’s	“new” operator.
		Cat c=new Cat();
		//If we run this code we get the ClassNotFoundException
		
		//Dynamic loading is a technique for programmatically invoking the functions of a class loader at run time. Let us look at how to load classes dynamically.
		Class vehicleClass = Class.forName(Cat) ;
		//It is also throws the ClassNotFoundException 
	}

}

package com.girish.serilizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.stream.FileImageInputStream;

class Dog implements Serializable
{
	int i=10;
	int j=20;
	public  NotSerializableClass nsc;
}
public class SerilazableEx 
{

	public static void main(String[] args) throws Exception
	{
		Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("F:/abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(oos);
		
		FileInputStream fis=new FileInputStream("F:/abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(+d2.i+"  "+d2.j);

	}

}

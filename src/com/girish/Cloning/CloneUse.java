package com.girish.Cloning;

public class CloneUse implements Cloneable
{
	int RollNo;
	String Name;
	public CloneUse(int RollNo,String Name)
	{
		this.Name=Name;
		this.RollNo=RollNo;
	}
	void display()
	{
		System.out.println(RollNo+""+Name);
	}
	
	public static void main(String[] args)
	{
		CloneUse c1=new CloneUse(101, "giri");
		c1.display();
		try {
			CloneUse c2=(CloneUse)c1.clone();
			c2.display();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

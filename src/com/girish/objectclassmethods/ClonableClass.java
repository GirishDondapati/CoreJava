package com.girish.objectclassmethods;

public class ClonableClass{

	Integer id1;
	String id;
    String whatevs;

    ClonableClass(String id, String whatevs) {
        this.id = id;
        this.whatevs = whatevs;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof ClonableClass) {
            return ((ClonableClass)other).whatevs.equals(this.whatevs);   
        }
        else
        {
        	return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
	public static void main(String[] args){
		System.out.println();
				
		ClonableClass cs=new ClonableClass("id", "something");
		ClonableClass cs1=new ClonableClass("id", "something else");
		if(cs.hashCode()==cs1.hashCode())
		{
			System.out.println("== true");
			
		}
		else
		{
			System.out.println("== false");
		}
		if(cs.equals(cs1))
		{
			System.out.println("equals is true");
		}
		else
		{
			System.out.println("Equals false");
		}
		
	}

}

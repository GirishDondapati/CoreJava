/*
public class Bike implements ThisInterface
{ 
	//int x=10;
	public Bike()
	{	
		
		System.out.println("default constructor");
		
	}

	public static void main(String args[])
	{
		Bike b=new Bike();
	
		
	}
}
*/

public class Bike {
   /*public static void main(String args[]) { 
      Integer intObj=Integer.valueOf(args[args.length-1]);
      int i = intObj.intValue();

      if(args.length > 1) 
         System.out.println(i);
      if(args.length > 0)
         System.out.println(i - 1);
      else 
         System.out.println(i - 2);
   }*/
	/*
	 public static void main(String args[]) {
	      int x = 10, y;
	      if(x < 10) 
	         y = 1;
	      if(x>= 10)
	    	y = 2;
	      System.out.println("y is " + y);
	   }
		   */
	
		   public static void main(String args[]) 
			{
			outer: 	    
			for(int i = 0; i < 3; i++) 
			{
				for(int j = 3; j >= 0; j--) 
				{
					 if(i == j) continue outer;
					 System.out.println(i + " " + j);
				}
			}
			}
   
}
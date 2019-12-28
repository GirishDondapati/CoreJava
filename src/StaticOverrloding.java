
class A 
{
   public static void show() 
   {
      System.out.println("Class A show() function");
   }
}

class B extends A 
{
   public static void show() 
   {
      System.out.println("Class B show() function");
   }
}

public class StaticOverrloding 
{
   public static void main(String[] args) 
   {
		        
	   StaticOverrloding cls = new StaticOverrloding();
		     Class c = cls.getClass();      
		     System.out.println(c);  
		   
		     Object obj = new A();        
		     A b1 = new B();
		     b1.show();
		        
		     // casts object
		     Object a = A.class.cast(b1);
		   
		     System.out.println(obj.getClass());
		     System.out.println(b1.getClass());
		     System.out.println(a.getClass());               
		   }

}

class BaseClass
 {
	 public static void m1()
	 {
		 System.out.println("m1 method in base class");
	 }

}
 
public class ParentClass extends BaseClass
 {
	 public static void m1()
	 {
		 System.out.println("m1 method in Parent class");
	 }
	 public static void main(String args[])
	 {
		BaseClass bc=new BaseClass();
		bc.m1();
		ParentClass pc=new ParentClass();
		pc.m1();
		BaseClass bc1=new ParentClass();
		bc1.m1();
		/*//ParentClass pc1=(ParentClass) new BaseClass();
		pc1.m1();*/
		/*Exception in thread "main" java.lang.ClassCastException: BaseClass cannot be cast to ParentClass
	      at ParentClass.main(ParentClass.java:24)*/
		
		/* ParentClass pc1=new BaseClass();
		 pc1.m1();
		 //Type mismatch: cannot convert from BaseClass to ParentClass
        */		
		
		
		
	 }
 }

/*public class MainClass
{
	public static void main(String args[])
	{
		ParentClass pc=new ParentClass();
		pc.m1();
	}
}
*/
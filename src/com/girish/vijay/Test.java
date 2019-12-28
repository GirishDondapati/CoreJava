class SuperClass {

	 SuperClass()
	{		
		 System.out.println("Super class Method");
	}
 static class SubClass 
{ 
	 SubClass(){
		 System.out.println("Sub class Method");			
	 }
	
}
 }
   class Test
   {
	   public static void main(String args[]){
		   SuperClass.SubClass sub=new SuperClass.SubClass();
		   
	   }
   }
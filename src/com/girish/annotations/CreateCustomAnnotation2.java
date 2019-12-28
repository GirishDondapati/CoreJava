package com.girish.annotations;

@interface MySampleAnn {
	 
    String name();
    String desc();
}
 
class MyAnnTest{
    @MySampleAnn(name = "test1", desc = "testing annotations")
    public void myTestMethod(String name,String desc){
        System.out.println(name+"  ");
    }
}
public class CreateCustomAnnotation2 
{
	public static void main(String[] args) throws Exception 
	{
        MyAnnTest m=new MyAnnTest();
        m.myTestMethod(null, null);
    }

}

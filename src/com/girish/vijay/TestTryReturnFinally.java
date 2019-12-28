public class TestTryReturnFinally  
{     
    private static int value = 0;  
      
    private static int doTest()  
    {  
        try  
        {  
            System.out.println( "in try : value = " + value );  
            return (value = 1);  
        }  
        finally  
        {  
            System.out.println( "in finally : value = " + value );  
            return (value = 2);  
        }  
    }  
      
    public static void main(String[] args)  
    {  
        System.out.println( "before call : value = " + value );  
        int value3 = doTest();  
       // System.out.println( "after call : value = " + value );  
       // System.out.println( "returned value = " + value3 );       
    }  
}  
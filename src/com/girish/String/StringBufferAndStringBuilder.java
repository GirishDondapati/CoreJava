package com.girish.String;

public class StringBufferAndStringBuilder 
{
	/*public static void main(String[] args) 
	{
        int N = 777777;
        long t;

        { 
        	//StringBuffer is synchronised so that execution time is slow
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i-->0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
        
      //StringBiulder is not synchronised so that execution time is fast

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }
*/
	
	
	//StringBuffer conatains multipule append methods in that one method is
	// append(char[] ch) check that Example
	
	public static void main(String[] args) {
		char[] ch={'a','b','c','d','g','g'};
		StringBuffer sb = new StringBuffer();
		sb.append(ch);
		System.out.println(sb);
	}
}

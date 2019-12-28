package com.ds.arrays;

public class LaraTechnologiesQue {
	public static void main(String[] args)
	{
		
		 /*int x= 0;
	     int y= 0;
        for (int z = 0; z < 5; z++) 
        {
            if (( ++x > 2 ) && (++y > 2)) 
            {
                x++;
            }
        }
	    System.out.println(x + " " + y);*/
		
		 int x= 0;
	        int y= 0;
	        for (int z = 0; z < 5; z++) 
	        {
	            if (( ++x > 2 ) || (++y > 2)) 
	            {
	                x++;
	            }
	        }
	    System.out.println(x + " " + y);
	    

		/*int[] x = new int[2];
		int[] y = x;
		y[0]=4;
		Object obj = y;
		int[] z = (int[]) obj;
		System.out.println("done");*/
		
		/*int x=10;
		int i=0;
		for(i=0;i<=x;++i)
		{
			System.out.println(i);
		}
		
		while(i<=x)
		{
			i+=2;
			System.out.println(i);			
		}*/
		
		/*int i,j,k=10;
		j=k;
		i=20;
		j=30;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);*/
		
		/* int k = 3;
		 System.out.println(k++);
		System.out.println(k);
		System.out.println(k--);
		System.out.println(++k);*/
		
		/*int i = 5;
		int j = --i  + i++  + i  + i-- + i;
		System.out.println(j);
		System.out.println(i++);*/
		
		/*int i = 0;
    	int j = i++;
    	System.out.println(i+"  "+j);
    	i = ++i+i--  + -- i  + --j;
    	System.out.println(i);
    	System.out.println(j);*/
		
		/*int i = 100;
		int  j = i--  + i++  +  i  +  i;
		System.out.println(i);
		System.out.println(j);*/
		
		/*int i = 11;
		System.out.println(i--);
		System.out.println(--i);
		System.out.println(i++);
		System.out.println(--i +  ++i);
		System.out.println(i++  +  i-- );*/

		
		/*int i = 10;
		System.out.println("main1:" + i);
		i=test(i);
		System.out.println("main2:" + i);*/
		
		/*int i = 10;
		System.out.println("main1:" + i);
		System.out.println(test1(i));
		System.out.println("main2:" + i);*/
		 
		
		/*int i = 5;
		System.out.println(i=test3(i));
		System.out.println(i=4);
		System.out.println(++i);*/
		
		/*int i = 0;
		int j = ++i+ test4(i)+ test5(++i);// +test4(i--);
		System.out.println(i);
		System.out.println(test4(i--));
		System.out.println(i);
		System.out.println(j);*/
		
		/*int i = 10;
		int j = --i  +  test6(--i)  +   test7(i--);
		System.out.println(i--);
		System.out.println(--j);*/

	}
	/*static int test6(int i) 
	{
		return ++i;
	}
	static int test7(int i) 
	{
		return i--;
	}*/


	/*static  int test(double j)
	{
		j = 20.0;
		return j;
	}*/

	/*static void test1(int i)  
	{
		i = 20;
		return;
	}
	 */
	
	static int test3(int i) 
	{
		System.out.println("from test3:"+i);
		return --i;
	}
	 
	/*static int test4(int i) 
	{
		return ++i;
	}
	static int test5(int i) 
	{
		return i++;
	}*/

}

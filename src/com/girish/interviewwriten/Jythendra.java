package com.girish.interviewwriten;
public class Jythendra {	
	public static void main(String[] args) {
		int a[]={1,1,1,1,2,3,4,4,4,5,6,7,9,10,14,16,17,18,20,25,27};
		int n,m;
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{	
			n=a[i];
			m=a[i+1];
			if(n==(m-1))
			{
				count++;
				if(count==1)
				{
					System.out.print(n+"-");
				}	
				continue;
			}
			else if(n==m)
			{
				continue;				
			}
			else
			{	
				System.out.print(n);				
			}			
			System.out.print(",");			
		}
		
		if(a[a.length-1]==a[a.length-2]){
			System.out.println(a[a.length-1]);
		}else{
			System.out.println(a[a.length-1]);
		}
	}

}

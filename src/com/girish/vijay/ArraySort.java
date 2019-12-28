package com.girish.vijay;
public class ArraySort {
	public static void main(String[] args) {
		int a[]={24, 45,2,56,10};
		int t;
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=1;j<a.length;j++){
				if(a[j-1]<a[i])
				{
					t=a[j-1];
					a[j-1]=a[i];
					a[i]=t;
				}
			}		
		}
		
		System.out.println(a[0]+"  "+a[1]);	

	}

}

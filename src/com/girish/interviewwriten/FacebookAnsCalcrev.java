package com.girish.interviewwriten;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FacebookAnsCalcrev {

	public static void main(String args[]){
		System.out.print("Enter the no. of Array element=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		Random rd=new Random();
		System.out.println("Limit of random no.=");
		int no=sc.nextInt();
		for(int i=0;i<n;i++){
		ar[i]=rd.nextInt(no);
		}
		Arrays.sort(ar);
		int cons[]=new int[n];
		int rep[]=new int[n];
		//for(int i=0;i<ar.length;i++)
		// System.out.println(ar[i]);
		int sum=0;
		int k=0;
		for(int i=0;i<ar.length;i++){
		int count=1;
		for(int j=i+1;j<ar.length;j++){
		if(ar[i]==ar[j]){
		count++;
		i++;
		}
		}
		if(count>1){
		//System.out.print(ar[i]+"("+count+")"+",");
		cons[k]=ar[i];
		rep[k]=count;
		k++;
		}
		else{
		//System.out.print(ar[i]+",");
		rep[k]=count;
		cons[k]=ar[i];
		k++;
		}
		//System.out.println("k="+k);
		}
		for(int m=0;m<k;m++){
		//System.out.println("m="+cons[m]);
		}
		for(int m=0;m<k;m++){
		//System.out.println("rep="+rep[m]);
		}
		for(int m=0;m<k;m++){
		int f=0,so=0;
		int op=cons[m];
		while((cons[m]-cons[++m])==-1){
		int ui=m-1;
		so=so+(rep[ui]+rep[m]);
		f=1;
		}
		m--;
		if(f==1){
		System.out.print(op+"-"+cons[m]+"("+so+")"+",");f=0;
		}else{
		if(rep[m]>1)
		System.out.print(cons[m]+"("+rep[m]+")"+",");
		else
		System.out.print(cons[m]+",");
		}
		}
		} 
}

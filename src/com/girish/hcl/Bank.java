package com.girish.hcl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Bank {
	int tot_acc=0;
	final int max_acc=2;
	 
	public static void main(String[] args) {
	
Bank b=new Bank();
b.createAccount();
b.createAccount();
b.createAccount();
b.deposit("001", 1600);
b.deposit("002",0);
b.search("001");
b.search("002");
b.withdraw("001",0);	
}

Map<String, Account> hm=new HashMap<String, Account>();
Account ac=null;

public void createAccount()
{  final int min_bal=500;
	if(tot_acc<max_acc)
	{  	
		Scanner s1=new Scanner(System.in);
	    System.out.println("enter account no: ");
	    String  str=s1.next();
	    System.out.println("enter Name: ");
	    String str1=s1.next();
	    float str2=min_bal;
	    ac=new Account(str1,str2);
	    hm.put(str,ac);
		tot_acc=tot_acc+1;
	}
	else
	{
		System.out.println("Account not possible to add");
	}
			
	}
public void deposit(String accno,float amount)
{
if(hm.containsKey(accno))
{
if(amount>0)
{
float bal=hm.get(accno).Balance;
bal=bal+amount;
hm.get(accno).Balance=bal;
System.out.println("after deposit balance in "+accno+" is: "+hm.get(accno).Balance);
}
else
{
	System.out.println("Enter correct amount");
}
}
else
{
System.out.println("Account not exist enter valid account number");
}
}
public void withdraw(String accno, float amount)
{
	if(hm.containsKey(accno))
	{
	float bal=hm.get(accno).Balance;
	if(bal>amount)
	{
		if(amount>0)
		{
		bal=bal-amount;
		hm.get(accno).Balance=bal;
		System.out.println("After withdraw balance in "+accno+" is: "+hm.get(accno).Balance);
	}
		else
		{
			System.out.println("Enter correct amount");
		}
	}
	else
	{
	System.out.println("in sufficient balance");
	}
	}
}
public void search(String accno)
{   
	if(hm.containsKey(accno))
    {
	System.out.println("searched account number is: "+accno);
	System.out.println("Account holder name is: "+hm.get(accno).AccName);
	System.out.println("Account Balance is: "+hm.get(accno).Balance);
    }
	else
    {
	System.out.println("account not exist enter correct account number");
    }
}
}





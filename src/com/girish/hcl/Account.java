package com.girish.hcl;

public class Account {
	String Accno;
	String AccName;
	float Balance;
	public Account(String name, float bal) {
		
		AccName = name;
		Balance = bal;
	}
	
	
	public String getAccno() {
		return Accno;
	}
	public void setAccno(String accno) {
		Accno = accno;
	}
	public String getAccName() {
	return AccName;
	}
	public void setAccName(String accName) {
	AccName = accName;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}	
}

	
	





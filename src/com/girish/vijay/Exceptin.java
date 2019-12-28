package com.girish.vijay;

public class Exceptin {

	public static void main(String[] args) {
		try {
			Exceptin e = new Exceptin();
			e.m();
			int x = 10 + 21;
			System.out.println("value is\t" + x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void m() {
		try {
			int i = 0;
			System.out.println("value is ::\t" + 10/i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

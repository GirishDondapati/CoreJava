package com.girish.facebook;

public class FaceBookSCJP1 {

	private int squares = 81;
	public static void main(String[] args) {
	new FaceBookSCJP1().go();
	}
	void go() {
	incr(++squares);
	System.out.println(squares);//void method 82 prints; int method 82 prints
	}
	/*void incr(int squares) {
	squares += 10;
	}*/
	int incr(int squares) {
		return squares += 10;
		}

}

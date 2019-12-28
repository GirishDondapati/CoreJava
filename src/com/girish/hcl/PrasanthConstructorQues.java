package com.girish.hcl;

class Test98 {
	private static Test98 t = null;

	public static Test98 getInTest98() {
		if (t == null) {
			t = new Test98();
			return t;
		} else {
			return t;
		}
	}
}

class Test876 {
	Test876() {
		System.out.println();
	}

	private Test876(int a) {
		System.out.println();
	}

	private Test876(String s) {
		System.out.println();
	}
}

public class PrasanthConstructorQues extends Test876{
	private PrasanthConstructorQues() {
		System.out.println("HclPrasanthConstructorQues default constructor");
	}

	PrasanthConstructorQues(int a) {
		System.out.println("HclPrasanthConstructorQues Param constructor");
	}

	public static void main(String[] args) {
		PrasanthConstructorQues hp = new PrasanthConstructorQues();

		
	}

}

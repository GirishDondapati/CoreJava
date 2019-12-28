package com.girish.hcl;



class Tike implements Cloneable {
	public void m1() {
		System.out.println("m1 method of Tike class");
	}
}

class Tike2 extends Tike implements Cloneable {
	public void m1() {
		System.out.println("m1 methosd of tike2 class");
	}

	public void m2() {
		System.out.println("m2 method of tike2 class");
	}
}

public class DeepCloningShallowCloning extends Tike2 implements Cloneable{

	public static void main(String[] args) {
		Tike t=new Tike();
		Tike tdc=t;
		System.out.println(t.hashCode()+" :clone hash code: "+tdc.hashCode());
		Tike tsc=(Tike)t; 
		System.out.println(t.hashCode()+" :clone hash code: "+tsc.hashCode());
		Tike t1=new Tike2();
		Tike t1dc=t1;
		System.out.println(t1.hashCode()+" :clone hash code: "+t1dc.hashCode());
		Tike2 t1sc=(Tike2)t1;
		System.out.println(t1.hashCode()+" :clone hash code: "+t1sc.hashCode());
		Tike2 t2=new Tike2();
	}

}

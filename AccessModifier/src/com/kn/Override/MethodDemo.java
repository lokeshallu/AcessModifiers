package com.kn.Override;

public class MethodDemo {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		
		p1.skincolor();
		p1.height();
		p1.eyecolor();
		p1.weight();
		
		System.out.print("--------------------------------------");
		System.out.println();
		Child c1 = new Child();
		c1.skincolor();
		c1.height();
		c1.eyecolor();
		c1.weight();
		c1.insat();
		c1.pubg();

	}

}

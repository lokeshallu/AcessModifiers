package com.kn.pack2;

import com.kn.pack1.Demo1;

public class Demo5 {
	public void dipalay1() {
		
	Demo1 d1 = new Demo1();

		System.out.println("Demo 5 a= "+d1.a);
//		System.out.println("Demo 5 b= "+d1.b);---> protected working only same package and also working other package 
//		                              have inheritance herachey
//		System.out.println("Demo 5 c= "+d1.c);---> package or default working only same package
//		System.out.println("Demo 5 d= "+d1.d);----->private
	}

}

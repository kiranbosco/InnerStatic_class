package com.staticInner;

public class Outer {
	static class Inner{
		
		public static void testMethod() {
			System.out.println("inner static method");
		}
		
		public void testMethod2() {
			System.out.println("inner non static method");
			
		}
		
	}
public static void main(String[] args) {
	Outer.Inner.testMethod();
	Inner in=new Inner();
	in.testMethod2();
	
}
}

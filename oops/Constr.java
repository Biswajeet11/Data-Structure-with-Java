package com.myjavapractce;

public class Constr {

	static int b;
	static {
		b= 89;
	}
	final static int a =9;
	public static void main(String[] args) {
		
		
		Abc ab=new Abc();
	}
}
	class Abc{
		public Abc() {
		
			System.out.println("hhghghgh");
			
		}
		
		public static void  abc(int i) {
	
			
			System.out.println(i);
			
		}
//		public Abc(double i) {
//			System.out.println(i);
//		}
	}


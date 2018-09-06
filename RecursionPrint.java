package com.myjavapractce;

public class RecursionPrint {
	public static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		print(n-1);
	}
	public static void main(String []args) {
		print(6);
	}
}

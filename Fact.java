package com.myjavapractce;

import java.util.Scanner;

public class Fact {
	public static int factorial(int n) {
		if(n==1||n==0) {
			return 1;
		}
		int fact=(n)*factorial(n-1);
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n;
		for(int i=0;i<num;i++) {
		n=sc.nextInt();
		int fct=factorial(n);
		System.out.println(fct);
		}
	}
}

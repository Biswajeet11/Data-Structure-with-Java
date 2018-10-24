package com.myjavapractce;

import java.util.Scanner;

public class TriangleSum {
	public static int ndigits(int n) {
		int digits=(int)Math.log10(n)+1;
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nu=	ndigits(n);
		if(nu==1) {
	    System.out.print(nu);
	}
		else if(nu==2) {
			 System.out.print(nu);
		}
		else if(nu==3) {
			 System.out.print(nu);
		}
		else {
			System.out.print("More than 3 digits");
		}
}
}

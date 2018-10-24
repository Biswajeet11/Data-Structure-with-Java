package com.myjavapractce;

import java.util.Scanner;

public class ReverseNum {
	
	public static int reverse(int n) {
		int r,rev=0;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n;
		for(int i=0;i<num;i++) {
		n=sc.nextInt();
		int revnum=	reverse(n);
		System.out.println(revnum);
		}
	}

}

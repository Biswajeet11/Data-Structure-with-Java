package com.myjavapractce;

import java.util.Scanner;

public class SumOfDigits {
	
	public int sum(int n) {
		int r, s=0;
		while(n>0) {
			r=n%10;
			s=s+r;
			n=n/10;
		}
		return s;
	}

	public static void main(String[] args) {
		SumOfDigits s=new SumOfDigits();
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int su[]=new int[n1];
		for(int i=0;i<n1;i++) {
			 su[i]=sc.nextInt();
		}
		for(int i=0;i<su.length;i++) {
		int sss=s.sum(su[i]);
		System.out.println(sss);
		}
		
	}

}

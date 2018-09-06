package com.myjavapractce;

import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		int a1=0;
		for(int i=0;i<n;i++) {
			a1=a1+(int)(b*(Math.pow(2, i)));
			System.out.println(a+a1);
		}
		
	}

}

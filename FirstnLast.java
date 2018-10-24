package com.myjavapractce;

import java.util.Scanner;

public class FirstnLast {
	
	public int[] firstnlast(int n[]) {
		int l,f,digits;
		int sum[]=new int[n.length];
		for(int i=0;i<n.length;i++) {
			l=n[i]%10;
			digits=(int)Math.log10(n[i]);
			sum[i]=l+(int)((int)(n[i])/(int)(Math.pow(10, digits)));
			//sum[i]=l+(int) (n[i] / (int) (Math.pow(10, digits)));
		}
		return sum;		
	}

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int arofnum[]=new int[num];
		for(int i=0;i<arofnum.length;i++) {
			arofnum[i]=sc.nextInt();
		}
		FirstnLast fl=new FirstnLast();
		int arr[]=fl.firstnlast(arofnum);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

// 1234
// 5
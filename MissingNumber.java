package com.myjavapractce;
import java.util.Scanner;
public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,6,};
		int n=sc.nextInt();
	    int total= n*(n+1)/2;
	    for(int i=0;i<arr.length;i++) {
	    	total=total-arr[i];	
	    }
	    System.out.println(total);
	}

}

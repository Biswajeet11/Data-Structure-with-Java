package com.myjavapractce;

public class NumberDigits {

	public int count(int n) {
		if(n==0) {
			return 0;
		}
		int smallAns=count(n/10);
		return smallAns+1;
	}
	public static void main(String[] args) {
	
		NumberDigits a=new NumberDigits();
		int c=a.count(15699);
		System.out.println(c);

	}

}

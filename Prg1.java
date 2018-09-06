package com.myjavapractce;

public class Prg1 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			for(int j=2;j<100;j++) {
				if(i%j==0) {
					count++;
					
				}
			}
				if(count==2) {
					System.out.print(i);
				}
			}
		}

	}

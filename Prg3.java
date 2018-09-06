package com.myjavapractce;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		int count=0;
		String text2="";
		String text3="";
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)!=' ') {
				text2=text2+text.charAt(i);
				count++;
			}
			else {
				text3=text3+text.charAt(i);
			}
			
		}
		System.out.println(count);
		if(text2.length()>text3.length()) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}

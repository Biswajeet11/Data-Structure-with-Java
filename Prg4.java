package com.myjavapractce;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		ArrayList list=new ArrayList();
		String array[]=new String[text.length()-2];
		int n=sc.nextInt();
		String text2;
		for(int i=0;i<text.length()-n;i++) {
			text2=text.substring(i,i+n);
			array[i]=text2;	
			System.out.println(text2);
		}
		System.out.print(array);

	}

}


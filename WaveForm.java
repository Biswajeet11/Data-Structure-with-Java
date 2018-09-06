package com.myjavapractce;

import java.util.Scanner;

public class WaveForm {
	
	public static void form(int input[][]) {
		Scanner sc =new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				input[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<=columns;j++) {
			if(j%2==0) {
				for(int i=rows;i>=rows;i--) {
					System.out.print(input[i][j]);
				}
			}
			else {
				for(int i=0;i<rows;i++) {
					System.out.print(input[i][j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[][] input= {{1,2,3},{3,4,5},{4,5,7}};
		form(input);
	}

}

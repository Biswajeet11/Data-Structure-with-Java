package com.myjavapractce;

public class PossibleCodes {

	public char getChar(int n) {
		return (char)(n+96);
	}
	
	public void printAllpossiblities(String input,String ans) {
		if(input.length()==0) {
			System.out.println(ans);
			return;
		}
		int firstDigit=input.charAt(0)-'0';
		printAllpossiblities(input.substring(1), ans+getChar(firstDigit));
		if(input.length()>1) {
		int firsttwoDigits=(input.charAt(0)-'0')*10+input.charAt(1)-'0';
		if(firsttwoDigits>=10 && firsttwoDigits<=26) {
			printAllpossiblities(input.substring(2), ans+getChar(firsttwoDigits));
			}
		}
	}
	
	
	public void printAllpossiblities(String input) {
		printAllpossiblities(input,"");
	}
	
	public static void main(String[] args) {
		PossibleCodes s=new PossibleCodes();
		s.printAllpossiblities("1125");
	}
}

package com.myjavapractce;

public class Removex {
	
	public String removex(String input) {
		if(input.length()==0) {
			return input;
		}
		if(input.charAt(0)=='x') {
			return removex(input.substring(1));
		}
		else {
			return input.charAt(0)+removex(input.substring(1));
		}
	}	
	public static void main(String[] args) {
		
		Removex a=new Removex();
		String s=a.removex("xaxaaaabcx");
		System.out.println(s);
	}
}

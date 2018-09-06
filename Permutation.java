package com.myjavapractce;

public class Permutation {

	public void permut(String input,String ans) {
		if(input.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<input.length();i++) {
			permut((input.substring(0, i)+input.substring(i+1)),ans+input.charAt(i));
		}
	}
	public void permut(String input) {
		permut(input,"");
	}
	public static void main(String[] args) {
		Permutation p=new Permutation();
		p.permut("abc");
	}

}

package com.myjavapractce;


//import java.io.*;
public class StringBuff {
	
	public static void main (String args[]) {
	StringBuffer buf=new StringBuffer("HELLO FDNHDJHFSADH");
	
	String a="ABAAAA";
	String b="ABAAAA";
	
	String c=new String("ABAAAA");
	String d=new String("ABAAAA");
	
	if(a==b) {
		System.out.println("hjkkkkkk");
	}
	
	buf.append("adc");
	System.out.println(buf);
	}

}

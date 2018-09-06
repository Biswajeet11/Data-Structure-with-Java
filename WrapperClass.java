package com.myjavapractce;

public class WrapperClass  {	
	public static void main(String [] args) {
		 Integer number1=new Integer(30);
		 Integer number2=new Integer(30);
		 Integer a=number1;
		 
		 
		 System.out.println(a==number2);
		 
		 Integer hundred=Integer.valueOf("100");
		 Integer x=9;
		 Integer y=9;
		 number1++;
		 number2++;
		 
		 String str1="hello";
		 String str2=str1;
		 str1.concat(" how are u?");
		 if(str1==str2) {
			 System.out.println("vnhhhhhhhhhhh");
		 }
		 
		 System.out.println(str1.hashCode());
		 System.out.println(str2.hashCode());
		 String s2="value1";
		 StringBuffer s3=new StringBuffer("Value3");
		 for(int i=0;i<100;i++) {
			 s3.append(s2);
			 
		 }
		
    System.out.println(s3);
	System.out.println(str1);
		 
		 
		System.out.println(number1+" "+number2+" "+hundred);
		System.out.println((number1==number2));
	    System.out.println(number1.equals(number2));
	    System.out.println(x.equals(y));
	}
}

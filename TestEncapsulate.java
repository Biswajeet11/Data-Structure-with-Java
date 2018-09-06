package com.myjavapractce;

public class TestEncapsulate {

	public static void main(String[] args) {
		
		Encapsulate e=new Encapsulate();
		e.setAge(10);
		e.setName("ggff");
		e.setRollNo(33);

		System.out.println(e.getAge());
		System.out.println(e.getName());
		System.out.println(e.getRollNo());
	}

}

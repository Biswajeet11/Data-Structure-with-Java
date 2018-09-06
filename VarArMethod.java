package com.myjavapractce;

import java.util.ArrayList;

public class VarArMethod {

	public static void main(String ... args) {	
		Show s=new Show();
		s.Display(1,868);
	}
}
	class Show{
		public void Display(int ... a)  //var arg method
		{
			for(int i: a) {
				System.out.println(i);
				}
			}
		public void Display2(int a)  //var arg method
		{
			System.out.println("hhjfhjfj");
			}
		}
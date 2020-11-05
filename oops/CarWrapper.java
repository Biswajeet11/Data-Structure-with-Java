package com.myjavapractce;

class Car {
	
	int no;
	int model;
	 
	 Car(int no,int model) {
		this.no=no;
		this.model=model;
		}

void print() {
	System.out.println("Number: "+no + " ,"+ " Model : "+model);
}
}


 class CarWrap {
	
	Car c;
	
	 CarWrap(Car c) {
		this.c=c;
	}
	
}

 public class CarWrapper{
	 
	 public static void swap(CarWrap c1, CarWrap c2 ) {
		 
		 Car temp=c1.c;
		 c1.c=c2.c;
		 c2.c=temp;
	 }
	 
	 public static void main(String args[]) {
		 
		 Car c1= new Car(123, 354);
		 Car c2=new Car(457, 633);
		 CarWrap cw1 = new CarWrap(c1);
	     CarWrap cw2 = new CarWrap(c2);
	     swap(cw1, cw2);
	     cw1.c.print();
	     cw2.c.print();
	     
	 }
	 
	 
 }


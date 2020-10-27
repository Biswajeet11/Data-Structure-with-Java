package com.myjavapractce;

 class Bicycle {
	
	int gear;
	int speed;
	
	Bicycle(int gear,int speed){
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBrake(int decrement) {
		speed-=decrement;
	}
	public void SpeedUp(int increment) {
		speed+=increment;
	}
	
	
	public String toString() {
		return ("No of gears are "+gear + " "+  "speed of bicycle is "+speed);
	}
	
}

class MountainBike extends Bicycle{
	
	int seatHeight;
	
	 MountainBike(int gear,int speed,int startHeight){
		  super(gear,speed);
		 seatHeight=startHeight;
	 }
	  public void setHeight(int newValue)
	    {
	        seatHeight = newValue;
	    } 
	   
	  public String toString()
	    {
	        return (super.toString()+
	                " seat height is "+seatHeight);
	    }
	     
	}

public class InheritProperty {
	public static void main(String [] args) {
		MountainBike m1=new MountainBike(100, 200, 45);
		System.out.println(m1.toString());
	}

}

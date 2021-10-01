package com.bridgelabz.empWage;

public class EmpAttendance1 {
	int IS_FULL_TIME; // create class attribute
	//create class constructor
	public EmpAttendance1() {
		IS_FULL_TIME=1;//set value for class attribute
	}
	public static void main(String[] args){
		EmpAttendance1 myobj = new EmpAttendance1();//create object of class
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == myobj.IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}

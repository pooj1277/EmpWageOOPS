/* CALCULATE EMPLOYEE DAILY WAGE : ASSUME WAGE PER HOUR IS 20 & FULL DAY HOUR IS 8 
 * */
package com.bridgelabz.empWage;
public class EmpWageDaily2 {
	int isPresent;
	int empRatePerHr;
	int empHrs;
	int salary;
	public EmpWageDaily2() {
		isPresent=1;
		empRatePerHr = 20;
		empHrs = 8;
		salary = 0;
	}
	public static void main(String[] args) {
		EmpWageDaily2 emp = new EmpWageDaily2();
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if( empCheck == emp.isPresent ){
			emp.salary = emp.empHrs * emp.empRatePerHr;
			System.out.printf("if");
		}else{			
			System.out.printf("else \n");
		}	
		System.out.printf("The salary is \t" +emp.salary);
	}
}

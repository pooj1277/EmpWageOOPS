//ADD PART TIME EMPLOYEE AND WAGE
package com.bridgelabz.empWage;

public class EmpWagePartTime3 {
	int IS_PART_TIME = 1;
	int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR;
	int empWage,empHrs;
	public EmpWagePartTime3() {
		EMP_RATE_PER_HOUR = 20;
		empWage = 0;
		empHrs = 0;
	}
	public static void main(String[] args) {
		EmpWagePartTime3 emp = new EmpWagePartTime3();
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if ( empCheck == emp.IS_PART_TIME)
			emp.empHrs = 4;
		else if ( empCheck == emp.IS_FULL_TIME)
			emp.empHrs = 8;
		else
			emp.empHrs = 0;		
		emp.empWage = emp.empHrs * emp.EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +emp.empWage);
	}

}

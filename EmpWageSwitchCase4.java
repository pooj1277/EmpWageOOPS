package com.bridgelabz.empWage;

public class EmpWageSwitchCase4 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	int empWage;
	int empHrs;
	public EmpWageSwitchCase4() {
		empWage = 0;
		empHrs = 0;
	}
	public static void main(String[] args) {
		int empCheck;
		EmpWageSwitchCase4 emp=new EmpWageSwitchCase4();
		empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case IS_PART_TIME:
			emp.empHrs = 4;
			break;
		case IS_FULL_TIME:
			emp.empHrs = 8;
			break;
		default:
			emp.empHrs = 0;
			break;
		}
		emp.empWage = emp.empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +emp.empWage);

	}

}

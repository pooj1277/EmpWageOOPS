package com.bridgelabz.empWage;

public class EmpWageMnth5 {
	//constants
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 20;
		int empWage, totalEmpWage,empHrs ;
		public EmpWageMnth5() {
			empWage = 0;
			totalEmpWage = 0;
			empHrs = 0;
		}
		
		public static void main(String[] args){
			EmpWageMnth5 emp = new EmpWageMnth5();
			for(int day=0; day< NUM_OF_WORKING_DAYS; day++) {
			int empCheck;
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
	        emp.totalEmpWage += emp.empWage;
			System.out.println("Emp Wage: " +emp.empWage);
	}
			System.out.println("Total Emp Wage: " +emp.totalEmpWage);
	}
}

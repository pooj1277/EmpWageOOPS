/*Calculate Employee Wages using class method and variables

 */
package com.bridgelabz.empWage;

public class EmpWageMethod7 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MNTH = 10;
	
	public static void main(String[] args) {
		
		int totalEmpwage=0;
		totalEmpwage = empwage();
		System.out.println("Total Emp Wage: " +totalEmpwage);
		
	}
	public static int empwage() {
		int totalEmpHrs=0, totalEmpWage =0;
		int totalWorkingDays = 0;
		EmpWageMethod7 emp=new EmpWageMethod7();
		while(totalEmpHrs <= MAX_HRS_IN_MNTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) 
		{
			int empHrs = 0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("\t Emp check: " +empCheck);
			switch (empCheck) 
			{
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;		
				break;
			default:
				empHrs = 0;
				break;

			}
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println(+totalEmpHrs);
			int empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage:" +empWage);


		}
		return(totalEmpWage);		
	}
}



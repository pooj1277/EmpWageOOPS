/*Calculate Wages till a condition of total working hours of 100 or max days oF
20 is reached for a month
 */
package com.bridgelabz.empWage;

public class EmpWageWorkingHrs6 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MNTH = 10;
	int totalEmpHrs, totalEmpWage;
	int totalWorkingDays;
	public EmpWageWorkingHrs6() {
		totalEmpHrs=0;
		totalEmpWage =0;
		totalWorkingDays = 0;
	}
	public static void main(String[] args) {	
		EmpWageWorkingHrs6 emp=new EmpWageWorkingHrs6();
		while(emp.totalEmpHrs <= MAX_HRS_IN_MNTH && emp.totalWorkingDays <= NUM_OF_WORKING_DAYS) 
		{
			int empHrs = 0;
			emp.totalWorkingDays++;
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
			emp.totalEmpHrs = emp.totalEmpHrs + empHrs;
			int empWage = empHrs * EMP_RATE_PER_HOUR;
			emp.totalEmpWage += empWage;
			System.out.println("Emp Wage:" +empWage);


		}
		System.out.println("Total Emp Wage: " +emp.totalEmpWage);
	}
}



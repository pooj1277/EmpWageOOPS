/*Save Employee Wages for each Company

 */
package com.bridgelabz.empWage;

public class EmpWageByCompany9 {

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;

	private String companyName;
	private int empRatePerHr, maxWorkingHrs, maxWorkingDays, totalEmpWage;

	public EmpWageByCompany9(String companyName, int empRatePerHr, int maxWorkingHrs, int maxWorkingDays) {
		this.companyName = companyName;
		this.empRatePerHr = empRatePerHr;
		this.maxWorkingHrs = maxWorkingHrs;
		this.maxWorkingDays = maxWorkingDays;
	}

	public static void main(String[] args) {

		EmpWageByCompany9 bigBasket = new EmpWageByCompany9("BigBasket", 25, 120, 26);
		EmpWageByCompany9 jioMart = new EmpWageByCompany9("Jio Mart", 22, 140, 28);
		bigBasket.calculateWage();
		System.out.println(bigBasket);
		jioMart.calculateWage();
		System.out.println(jioMart);
	}

	public void calculateWage() {
		// Variables
		int empHrs = 0, empWage = 0, totalEmpHr = 0, totalEmpWorkingDays = 0;

		while (totalEmpWorkingDays < maxWorkingDays && totalEmpHr <= maxWorkingHrs) {
			int empCheck = (int) Math.floor(Math.random() * 10 % 3);
			totalEmpWorkingDays++;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHr += empHrs;
			empWage = empHrs * empRatePerHr;

			System.out.println(
					"Day " + totalEmpWorkingDays + " Working Hours " + empHrs + " , & Todays wage is " + empWage);
		}
		totalEmpWage = totalEmpHr * empRatePerHr;
	}

	public String toString() {
		return "Total Wage for company " + this.companyName + " is : " + totalEmpWage;
	}
}
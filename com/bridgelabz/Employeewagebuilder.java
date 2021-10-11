package com.bridgelabz;

import java.util.Random;

public class Employeewagebuilder {
	// Declaring a constant
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;

  
    public static int computeWage(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        // Declaring the variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        /*
         * Using random method 
         */
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULLTIME: // FullTime Employee
                    empHrs = 8;
                    break;
                case IS_PARTTIME: // PartTime Employee
                    empHrs = 4;
                    break;
                default:  // Employee is absent
                    empHrs = 0;
            }
            empWage = empRatePerHour * empHrs;
            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours " +
                                ", Employee Wage : " + empWage );
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Wages of an employee in " +companyName + " company is : " + totalEmpWage + "\n");
        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        computeWage("TCS" , 200, 3, 10) ;
        computeWage("Accenture", 100, 4, 12);
        computeWage("Infosys", 150, 2, 10);
    }
}
package com.bridgelabz;

import java.util.Random;

public class Employeewagebuilder {
	// Declaring a constant
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;

    private final String companyName;
    private final int empRatePerHour;
    private final int noOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

   
    public Employeewagebuilder(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

  

    public void computeWage() {
        // Declaring the variables
        int empHrs = 0;
        int empWage = 0;
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
    }

    @Override
    public String toString(){
        return "Total Wages of an employee in " +companyName + " company is : " + totalEmpWage + "\n";
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        Employeewagebuilder infosys = new Employeewagebuilder("Infosys", 150, 2, 10);
        Employeewagebuilder tcs = new Employeewagebuilder("TCS" , 200, 3, 10);
        Employeewagebuilder accenture = new Employeewagebuilder("Accenture", 100, 4, 12);
        infosys.computeWage();
        System.out.println(infosys);
        tcs.computeWage();
        System.out.println(tcs);
        accenture.computeWage();
        System.out.println(accenture);
    }
}
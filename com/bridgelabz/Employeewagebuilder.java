package com.bridgelabz;

import java.util.Random;

public class Employeewagebuilder {
        public static final int IS_FULLTIME = 1;
	    public static final int IS_PARTTIME = 2;
	    public static final int Emp_Rate_PerHr = 20;

	    public static void main(String[] args) {
	        System.out.println("Welcome To Employee Wage Computation Program");
	        
	        int empHrs = 0;
	        int empWage = 0;
	        /*
	          Using random method 
	         */
	        Random random = new Random();
	        int empCheck = random.nextInt(3);
	        switch (empCheck) {
	            case IS_FULLTIME: // FullTime Employee
	                empHrs = 8;
	                break;
	            case IS_PARTTIME: // PartTime Employee
	                empHrs = 4;
	                break;
	            default: // Employee is absent
	                empHrs = 0;
	        }
	        /*
	          Calculating the daily employee wage of an employee
	         */
	        empWage = Emp_Rate_PerHr * empHrs;
	        System.out.println("The daily wage of an employee is : " + empWage);
	    }
	}
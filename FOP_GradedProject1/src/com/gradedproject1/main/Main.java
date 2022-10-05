package com.gradedproject1.main;

import com.gradedproject1.admin.AdminDepartment;
import com.gradedproject1.hr.HrDepartment;
import com.gradedproject1.superdepartment.SuperDepartment;
import com.gradedproject1.tech.TechDepartment;

/*
 * → Driver class Main will be used to create objects of HrDepartment,
 * TechDepartment, AdminDepartment → Each department will display all its
 * functionalities. → Each department will display whether today is a holiday or
 * not with the help of the Super Department. (SuperDepartment will act as a
 * super class for all the departments)
 * 
 */

//Driver Class
public class Main {

	public static void main(String[] args) {

		// Objects for HR, TECH and ADMIN Department;
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();
		SuperDepartment admin = new AdminDepartment();

		// Output of all Department;
		// HR 					
		System.out.println(hr.departmentName());
		System.out.println(hr.isTodayAHoliday());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(((HrDepartment) hr).doActivity());

		// TECH
		System.out.println(tech.departmentName());
		System.out.println(tech.isTodayAHoliday());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(((TechDepartment) tech).getTechStackInformation());

		// ADMIN;
		System.out.println(admin.departmentName());
		System.out.println(admin.isTodayAHoliday());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());

	}

}

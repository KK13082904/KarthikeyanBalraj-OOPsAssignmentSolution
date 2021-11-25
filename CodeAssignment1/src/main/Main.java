package main;

import admin_department.AdminDepartment;
import hr_department.HrDepartment;
import tech_department.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Admin Department Start
		AdminDepartment adminObj = new AdminDepartment();
		
		System.out.println(" Welcome to "+adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());
		//Admin Department Ends
		
		System.out.println();
		
		//HR Department Start
		HrDepartment hrObj = new HrDepartment();
		
		System.out.println(" Welcome to "+hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());
		//HR Department Ends
		
		System.out.println();
		
		//Tech Department Start
		TechDepartment techObj = new TechDepartment();
		
		System.out.println(" Welcome to "+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.doActivity());
		System.out.println(techObj.isTodayAHoliday());
		//Tech Department Ends
		
		
	}

}

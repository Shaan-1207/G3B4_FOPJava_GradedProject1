package com.gradedproject1.admin;

import com.gradedproject1.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Department::->> Welcome to Admin Department";
	}

	public String getTodaysWork() {
		return "Today\'s Task::->> Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		return "Work Deadline::->> Complete by EOD";
	}
}

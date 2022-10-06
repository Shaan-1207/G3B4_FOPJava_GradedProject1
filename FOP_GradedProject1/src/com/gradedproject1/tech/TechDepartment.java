package com.gradedproject1.tech;

import com.gradedproject1.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Department::->> Welcome to Tech Department";
	}

	public String getTodaysWork() {
		return "Today\'s Task::->> Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Work Deadline::->> Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Tech Stack Info::->> core Java";
	}
}

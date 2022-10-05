package com.gradedproject1.hr;

import com.gradedproject1.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
		return "Department::->> HR Department";
	}

	public String getTodaysWork() {
		return "Today\'s Task::->> Fill today\'s timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Work Deadline::->> Complete by EOD";
	}
	
	public String doActivity() {
		return "Activity::->> team Lunch\n";
	}
}

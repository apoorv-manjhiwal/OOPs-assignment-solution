package department;

import hrDepartment.hrDepartment;

public class superDepartment {
	public String getDepartmentName;
	public String GetTodaysWork;
	public String getWorkDeadline;
	public String isTodayAHoliday;



superDepartment adminDepartment = new adminDepartment() { 
};


superDepartment hrDepartment = new hrDepartment() {
	};
	
	superDepartment techDepartment = new techDepartment() {
};

	public superDepartment getAdminDepartment() {
		return adminDepartment;
	}

	public void setAdminDepartment(superDepartment adminDepartment) {
		this.adminDepartment = adminDepartment;
	}

	public superDepartment getHrDepartment() {
		return hrDepartment;
	}

	public void setHrDepartment(superDepartment hrDepartment) {
		this.hrDepartment = hrDepartment;
	}

	public superDepartment getTechDepartment() {
		return techDepartment;
	}

	public void setTechDepartment(superDepartment techDepartment) {
		this.techDepartment = techDepartment;
	}

}

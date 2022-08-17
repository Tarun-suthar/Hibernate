package com.tns.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")
public class Manager extends Employee{
	
	
	private static final long serialVersionUID = 1L;
	private String DepartmentName;

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	
	

}
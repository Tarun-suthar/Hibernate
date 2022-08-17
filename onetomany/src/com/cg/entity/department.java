package com.cg.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class department {
	
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private Set <employee> employee=new HashSet<>();
	public Set<employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<employee> employee) {
		this.employee = employee;
	}
	public void addEmployee(com.cg.entity.employee employee) {
		employee.setDepartment(this);
		this.getEmployee().add(employee);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

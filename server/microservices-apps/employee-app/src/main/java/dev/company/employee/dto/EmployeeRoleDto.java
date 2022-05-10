package dev.company.employee.dto;

import java.util.List;

public class EmployeeRoleDto {

	private String name;

	private List<EmployeeDto> employees;

	public EmployeeRoleDto() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeDto> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDto> employees) {
		this.employees = employees;
	}

}

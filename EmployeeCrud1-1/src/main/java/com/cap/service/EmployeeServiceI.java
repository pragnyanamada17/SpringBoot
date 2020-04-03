package com.cap.service;

import java.util.List;

import com.cap.bean.Employee;

public interface EmployeeServiceI {

	Employee getEmployeeDetails(int id);

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee deleteEmployee(int id);

	List<Object> fetchAllEmployees();

}
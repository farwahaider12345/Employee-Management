package com.dao;

import com.model.Employee;

public interface EmployeeDao {

	void addEmployee();

	boolean deleteEmployee(int id);

	Employee findEmployee(int id);

	void displayAll();

}

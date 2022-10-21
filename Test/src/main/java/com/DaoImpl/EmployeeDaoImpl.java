package com.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> eList = new ArrayList<Employee>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);
	// creating object
	Employee ee = new Employee();

	public void addEmployee() {

		System.out.println("Enter the id :"); // printing
		ee.setId(sc.nextInt());
		System.out.println("Enter the name :"); // printing
		ee.setName(sc.next());
		System.out.println("Enter the salary :"); // printing
		ee.setSalary(sc.nextFloat());

		// adding the employee
		eList.add(ee);
		System.out.println(eList);

	}

	// creating delete method
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee edel = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				edel = e;
		}
		// check whether the record is present
		if (edel == null)
			status = false;
		else {
			eList.remove(edel);
			status = true;
		}

		return status;
	}

	// creating find method
	public Employee findEmployee(int id) {
		Employee efind = null;
		// finding the employee
		for (Employee e : eList) {
			if e.getId() == id)
				efind = e;
		}

		return efind;
	}

	// creating display method
	public void displayAll() {
		// TODO Auto-generated method stub

		for (Employee e : eList) {
			System.out.println(e);
		}

	}

}

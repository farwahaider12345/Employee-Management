package com.Test;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.daoimpl.EmployeeDaoImpl;
import com.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void menu() {
		System.out.println("EMPLOYEE MANAGEMENT ");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Display all the Employee");
		System.out.println("4.Exit");
	}

	public static void main(String[] args) {
			// creating Scanner Object
			Scanner sc1 = new Scanner(System.in);
			// creating object of imp
			EmployeeDao school = new EmployeeDao(
				 int int ch = 0;
				do {};
			
			try {
					menu();
					ch = sc1.nextInt();
					switch (ch) {
					case 1:
						school.addEmployee();
						System.out.println("Employee added");
						break;
					case 2:
						System.out.println("Enter the Id to be deleted:");
						int id = sc1.nextInt();
						boolean flag = school.deleteEmployee(id);
						if (flag)
							System.out.println("Employee details deleted");
						else
							System.out.println("Employee not found......");
						break;

					case 3:
						school.displayAll();
						break;

					case 4:
						System.exit(0);
						break;
					default:
						System.out.println("Wrong input");

					}

				while (ch != 4);

				sc1.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}

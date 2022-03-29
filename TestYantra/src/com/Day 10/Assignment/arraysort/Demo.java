package com.ob.day10.arraysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Abisheikha
 */
public class Demo {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Abi", "Trainee", 70000);
		Employee employee2 = new Employee(2, "Neha", "Trainee", 20000);
		Employee employee3 = new Employee(3, "Anu", "Trainee", 35000);
		Employee employee4 = new Employee(4, "Arthi", "Trainee", 10000);
		Employee employee5 = new Employee(5, "Anitha", "Trainee", 50000);

		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(employee1);
		listOfEmployee.add(employee2);
		listOfEmployee.add(employee3);
		listOfEmployee.add(employee4);
		listOfEmployee.add(employee5);
		int num=1;
		while (num==1) {
			System.out.println("1.Sort by id\n2.Sort by name\n3.Sort by Salary\n4.Sort by designation\n5.Exit");
			System.out.println("Enter your choice: ");
			Scanner ch = new Scanner(System.in);
			int choice = ch.nextInt();
			switch (choice) {
			case 1:
				SortById sortById = new SortById();
				Collections.sort(listOfEmployee, sortById);
				break;

			case 2:
				SortByName sortByName = new SortByName();
				Collections.sort(listOfEmployee, sortByName);
				break;

			case 3:
				SortBySalary sortBySalary = new SortBySalary();
				Collections.sort(listOfEmployee, sortBySalary);
				break;

			case 4:
				SortByDesignation sortByDesignation = new SortByDesignation();
				Collections.sort(listOfEmployee, sortByDesignation);
				break;

			case 5:
				return;
			default:
				System.out.println("Enter valid choice");
				continue;

			}
			Iterator<Employee> iterator = listOfEmployee.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("If you want to continue give 1/0(yes/no) : ");
			num=ch.nextInt();
		}
		System.exit(0);
	}
}
package com.ob.day10.arraylistdisplay;
/**
* @author Abisheikha
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Demo {
	public static void main(String[] args) {
		Employee employee1= new Employee(1,"Abi","Trainee",30000);
		Employee employee2= new Employee(2,"Neha","Trainee",30000);
		Employee employee3= new Employee(3,"Anu","Trainee",30000);
		Employee employee4= new Employee(4,"Arthi","Trainee",30000);
		Employee employee5= new Employee(5,"Anitha","Trainee",30000);
		
		ArrayList<Employee> listOfEmployee=new ArrayList<>();
		listOfEmployee.add(employee1);
		listOfEmployee.add(employee2);
		listOfEmployee.add(employee3);
		listOfEmployee.add(employee4);
		listOfEmployee.add(employee5);
		
//		for (int i = 0; i < listOfEmployee.size(); i++) {
//			System.out.println(get(i));
//		}
		
//		for (Employee employee : listOfEmployee) {
//			System.out.println(employee);
//		}

//		employee1.compareTo(employee2);
		Collections.sort(listOfEmployee);  //sort by name
		Iterator<Employee> iterator = listOfEmployee.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

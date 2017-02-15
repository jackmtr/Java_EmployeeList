/**
 * Project : com.contography.employeeList 
 * File : Display.java
 * Date : Feb 15, 2017
 * Time : 12:21:06 PM
 */
package com.contography.employeeList.UI;

import java.util.List;

import com.contography.employeeList.data.Employee;

/**
 * @author Jackie
 *
 */
public class Display {

	public static void PrintList(List<Employee> employeeList, String label){
		System.out.println(label + " List");
		System.out.println("================");
		
		if(!employeeList.isEmpty()){
			for(Employee emp : employeeList){
				System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", " + emp.getPosition());
			}			
		}else{
			System.out.println("There are no rows in the list.");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void PrintEmployee(Employee employee){
		System.out.println(employee.getFirstName() + " " + employee.getLastName() + " : " + employee.getPosition());
		System.out.println("Phone Number : " + employee.getPhoneNumber());
	}
}

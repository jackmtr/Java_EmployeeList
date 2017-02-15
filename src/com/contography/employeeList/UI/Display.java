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

	public static void PrintList(List<Employee> employeeList){
		System.out.println("List");
		for(Employee emp : employeeList){
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", " + emp.getPosition());
		}
		System.out.println();
	}
}

/**
 * Project : com.contography.employeeList 
 * File : Search.java
 * Date : Feb 15, 2017
 * Time : 2:08:24 PM
 */
package com.contography.employeeList.util;

import java.util.List;

import com.contography.employeeList.data.Employee;

/**
 * @author Jackie
 *
 */
public class Search {

	//This is a linear search (ineffective but simple)
	//Learn the binary search later
	public static Employee searchByFirstName(String keyword, List<Employee> list){
		
		System.out.print("Searching for: " + keyword + " -- ");
		
		for(Employee emp : list){
			if (emp.getFirstName().equals(keyword)){
				System.out.println("Person was found");
				return emp;
			}
		}
		System.out.println("Person was not found");
		return null;
	}
}

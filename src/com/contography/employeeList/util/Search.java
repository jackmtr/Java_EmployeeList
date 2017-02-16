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

	public static Employee linearSearchByFirstName(String keyword, List<Employee> list){
		
		keyword = keyword.trim().substring(0, 1).toUpperCase() + keyword.trim().substring(1).toLowerCase();
		
		System.out.print("Linear Search for first name : " + keyword + " -- ");
		
		for(Employee emp : list){
			if (emp.getFirstName().equals(keyword)){
				System.out.println("Person was found");
				return emp;
			}
		}
		System.out.println("Person was not found");
		return null;
	}
	
	public static Employee binarySearchByLastName(String keyword, List<Employee> list){
		
		keyword = keyword.trim().substring(0, 1).toUpperCase() + keyword.trim().substring(1).toLowerCase();
		
		int lowIndex = 0;
		int highIndex = list.size() - 1;
		int middleIndex = (lowIndex + highIndex)/2;
		
		int hashedKeyword = keyword.hashCode();
		
		System.out.print("Binary Search for last name : " + keyword + " -- ");
		
		while(lowIndex < highIndex){
			if (hashedKeyword == list.get(middleIndex).getLastName().hashCode()){
				System.out.println("Person was found");
				return list.get(middleIndex);
			}else if(hashedKeyword > list.get(middleIndex).getLastName().hashCode()){
				lowIndex = middleIndex + 1;
			}else if(hashedKeyword < list.get(middleIndex).getLastName().hashCode()){
				highIndex = middleIndex -1;
			}
		}
		System.out.print("Person was not found");
		return null;
	}
}

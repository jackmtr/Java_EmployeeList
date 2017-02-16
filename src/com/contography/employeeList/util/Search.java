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
		
		int counter = 1;
		keyword = keyword.trim().substring(0, 1).toUpperCase() + keyword.trim().substring(1).toLowerCase();
		
		System.out.print("Linear Search for first name : " + keyword + " -- ");
		
		for(Employee emp : list){
			if (emp.getFirstName().equals(keyword)){
				System.out.println("Person was found, " + counter + " attempts.");
				return emp;
			}else{
				counter++;
			}
		}
		System.out.println("Person was not found, " + counter + " attempts.");
		return null;
	}
	
	public static Employee binarySearchByFirstName(String keyword, List<Employee> list){
		
		list = ListArranger.ArrangeByFirstNameLexicographically(list);
		
		int counter = 1;
		int lowIndex = 0;
		int highIndex = list.size() - 1;
		int midIndex = 0;
		
		String caseInsensitiveKeyword = keyword.trim().toLowerCase();
		
		System.out.print("Binary Search for first name : " + keyword + " -- ");
		
		while(lowIndex <= highIndex){
			
			midIndex = (lowIndex + highIndex)/2;
			if (caseInsensitiveKeyword.compareToIgnoreCase(list.get(midIndex).getFirstName()) > 0){
				lowIndex = midIndex +1;
				counter++;
			}else if (caseInsensitiveKeyword.compareToIgnoreCase(list.get(midIndex).getFirstName()) < 0){
				highIndex = midIndex -1;
				counter++;
			}else{
				break;
			}
		}
		if (lowIndex > highIndex){
			System.out.print("Person was not found, " + counter + " attempts.");
			return null;
		}else{
			System.out.println("Person was found, " + counter + " attempts.");
			return list.get(midIndex);
		}
	}
}

/**
 * Project : com.contography.employeeList 
 * File : ListArranger.java
 * Date : Feb 15, 2017
 * Time : 12:25:44 PM
 */
package com.contography.employeeList.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.contography.employeeList.data.Employee;

/**
 * @author Jackie
 *
 */
public class ListArranger {
	
	public static List<Employee> Reverse(List<Employee> employeeList){
		
		//will re-make with better methods when learned more about node manipulation
		//shouldn't need to make a second list
		List<Employee> reversedList = new ArrayList<Employee>();
		
		int size = employeeList.size();
		for (int i = (size-1); i >= 0; i--){
			reversedList.add(employeeList.get(i));
		}
		return reversedList;
	}
	
	public static List<Employee> ArrangeByFirstName(List<Employee> employeeList){
		
		CompareByFirstName cs = new CompareByFirstName();
		Collections.sort(employeeList, cs);
		
		return employeeList;
	}
	
	public static List<Employee> ArrangeByFirstNameLexicographically(List<Employee> employeeList){
		
		CompareByFirstNameLexicographically cs = new CompareByFirstNameLexicographically();
		Collections.sort(employeeList, cs);
		
		return employeeList;
	}	
	
	private static class CompareByFirstName implements Comparator<Employee>{
		@Override
		public int compare(Employee e1, Employee e2){

			int value = e1.getFirstName().substring(0,1).compareTo(e2.getFirstName().substring(0,1));

			return value;
		}
	}
	
	private static class CompareByFirstNameLexicographically implements Comparator<Employee>{

		/* (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(Employee e1, Employee e2) {
			
			int value = e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
			if(value != 0){
				return value;
			}
			return e1.getLastName().compareToIgnoreCase(e2.getLastName());
		}
	}
}



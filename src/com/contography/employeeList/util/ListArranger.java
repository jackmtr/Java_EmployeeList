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
	
	public static List<Employee> ArrangeByFirstName(List<Employee> employeeList){
		
		CompareByFirstName cs = new CompareByFirstName();
		Collections.sort(employeeList, cs);
		
		return employeeList;
	}
	
	// sorting helper
	private static class CompareByLength implements Comparator<Employee> {
		@Override
		public int compare(Employee e1, Employee e2) {
			// our sorting criteria is length of string
			int len1 = e1.getFirstName().length();
			int len2 = e2.getFirstName().length();
			return (len1 - len2);
		}
	}
	
	
	private static class CompareByFirstName implements Comparator<Employee>{
		@Override
		public int compare(Employee e1, Employee e2){
			//int name1 = e1.getFirstName().substring(0,1).hashCode();
			//int name2 = e2.getFirstName().substring(0,1).hashCode();
			int value = e1.getFirstName().substring(0,1).compareTo(e2.getFirstName().substring(0,1));
			
			//return (name1-name2);
			return value;
		}
	}
}



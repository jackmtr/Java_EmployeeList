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
		
		//will remake with better methods when learned
		//shouldnt need to make a second list
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



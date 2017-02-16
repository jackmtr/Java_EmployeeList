/**
 * Project : com.contography.employeeList 
 * File : Main.java
 * Date : Feb 15, 2017
 * Time : 10:01:17 AM
 */
package com.contography.employeeList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.contography.employeeList.DAO.EmployeeDAO;
import com.contography.employeeList.UI.Display;
import com.contography.employeeList.data.Employee;
import com.contography.employeeList.util.ListArranger;
import com.contography.employeeList.util.Search;

//import java.io.File;

/**
 * @author Jackie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			FileInputStream fileStream = new FileInputStream("EmployeeListInput.xls");
			
			try{
				List<Employee> employeeList = EmployeeDAO.generateEmployeeList(fileStream);
				
				Display.PrintList(employeeList, "Original");
				
				Display.PrintList(ListArranger.Reverse(employeeList), "Reversed");
				
				List<Employee> firstNameArrangedList = ListArranger.ArrangeByFirstName(employeeList);
				Display.PrintList(firstNameArrangedList, "Sorted First Name");
				
				Employee searchedEmployee = Search.linearSearchByFirstName("Jackie", employeeList);
				if (searchedEmployee != null) 
					Display.PrintEmployee(searchedEmployee);
				
				searchedEmployee = Search.binarySearchByLastName("Cheng", employeeList);
				if (searchedEmployee != null)
					Display.PrintEmployee(searchedEmployee);
			}catch(Exception e){
				throw e;
			}finally{
				fileStream.close();
			}
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());		
		}catch(Exception e){
			System.out.println("General Error:"  + e.getMessage());		
		}
	}
}

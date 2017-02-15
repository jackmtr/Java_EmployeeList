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
import com.contography.employeeList.data.Employee;

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
		// TODO Auto-generated method stub
		try{
			FileInputStream fileStream = new FileInputStream("EmployeeListInput.xls");
			List<Employee> employeeList = EmployeeDAO.generateEmployeeList(fileStream);
			
			for(Employee emp : employeeList){
				System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", " + emp.getPosition());
			}
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());		
		}catch(Exception e){
			System.out.println("General Error:"  + e.getMessage());		
		}
		
			//have file name
			//take info from file name to make list of employees
		//take list of employees and sort it by first name and print
		//reverse the list and reprint
	}
}

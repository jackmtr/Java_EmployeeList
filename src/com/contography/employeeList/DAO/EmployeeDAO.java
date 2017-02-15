/**
 * Project : com.contography.employeeList 
 * File : EmployeeDAO.java
 * Date : Feb 15, 2017
 * Time : 10:15:02 AM
 */
package com.contography.employeeList.DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.contography.employeeList.data.Employee;

/**
 * @author Jackie
 *
 */
public class EmployeeDAO {

	public static List<Employee> generateEmployeeList(FileInputStream fileInput) throws IOException{
	
		List<Employee> employeeList = new ArrayList<Employee>();
		
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook(fileInput);
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int i = 0; i < (sheet.getPhysicalNumberOfRows() - 1); i++){
			HSSFRow row = sheet.getRow(i);
			
			Employee newEmployee = new Employee(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString(), (int)Double.parseDouble(row.getCell(3).toString()), row.getCell(4).toString(), Double.parseDouble(row.getCell(5).toString()));
			employeeList.add(newEmployee);
		}
		return employeeList;
	}
}

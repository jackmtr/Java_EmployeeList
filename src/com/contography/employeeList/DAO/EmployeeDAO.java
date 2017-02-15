/**
 * Project : com.contography.employeeList 
 * File : EmployeeDAO.java
 * Date : Feb 15, 2017
 * Time : 10:15:02 AM
 */
package com.contography.employeeList.DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import com.contography.employeeList.data.Employee;

/**
 * @author Jackie
 *
 */
public class EmployeeDAO {

	//take file and make a list out of them.
	public static List<Employee> generateEmployeeList(FileInputStream fileInput) throws IOException{
	
//		HSSFWorkbook workbook1 = new HSSFWorkbook();
//		workbook1.createSheet("FirstExcelSheet");
//		workbook1.write(new FileOutputStream("EmployeeListInput1.xls"));
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		HSSFWorkbook workbook = new HSSFWorkbook(fileInput);
		HSSFSheet sheet = workbook.getSheetAt(0);
		//int i = sheet.getPhysicalNumberOfRows();
		
		for (int i = 0; i < (sheet.getPhysicalNumberOfRows() - 1); i++){
			HSSFRow row = sheet.getRow(i);
			
			Employee newEmployee = new Employee(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString(), (int)Double.parseDouble(row.getCell(3).toString()), row.getCell(4).toString(), Double.parseDouble(row.getCell(5).toString()));
			employeeList.add(newEmployee);
		}
		return employeeList;
	}
}

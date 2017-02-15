/**
 * Project : com.contography.employeeList 
 * File : Employee.java
 * Date : Feb 15, 2017
 * Time : 10:16:48 AM
 */
package com.contography.employeeList.data;

/**
 * @author Jackie
 *
 */
public class Employee extends Person{
	private int employeeId;
	private String position;
	private double salary;
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param employeeId
	 * @param position
	 * @param salary
	 */
	public Employee(String firstName, String lastName, String phoneNumber, int employeeId, String position,
			double salary) {
		super(firstName, lastName, phoneNumber);
		setEmployeeId(employeeId);
		setPosition(position);
		setSalary(salary);
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		if (employeeId > 0){
			this.employeeId = employeeId;
		}
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		if (position != null && position.length() >= 0){
			this.position = position;
		}
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		if (salary > 0){
			this.salary = salary;
		}
	}

}

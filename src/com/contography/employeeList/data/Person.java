/**
 * Project : com.contography.employeeList 
 * File : Person.java
 * Date : Feb 15, 2017
 * Time : 10:16:04 AM
 */
package com.contography.employeeList.data;

/**
 * @author Jackie
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 */
	public Person(String firstName, String lastName, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && firstName.length() >= 0){
			this.firstName = firstName;
		}
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName != null && lastName.length() >= 0){
			this.lastName = lastName;
		}
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber != null && phoneNumber.length() >= 0){
			this.phoneNumber = phoneNumber;
		}
	}
}

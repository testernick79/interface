package com.nickfonseca.Builder;

public class methods {
	private Object firstName;

	// an EmployeeBuilder object passed into the default constructor.
	private Employee(EmployeeBuilder builder) {
	    this.firstName = builder.firstName;
	    this.lastName = builder.lastName;
	    this.jobTitle = builder.jobTitle;
	    this.salary = builder.salary;
	    this.streetAddress = builder.streetAddress;
	    this.city = builder.city;
	    this.state = builder.state;
	    this.zipCode = builder.zipCode;
	    this.phoneNumber = builder.phoneNumber;
	}

}

package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	
	//add validation rules
	@NotNull(message="is required.")
	@Size(min=1, message="is required.")
	private String lastName;
	
	//add min/max validators
	@Min(value=0, message="must be greater than or equal to zero.")
	@Max(value=10, message="must be less than or equal to ten.")
	@NotNull(message="is required.")
	private Integer freePasses;
	
	//regexp validator
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 characters/digits")
	private String postalCode;
	
	
	//custom validator
	@CourseCode(value = "LUV", message="Must start with LUV ")
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}

package ie.atu.sw;

import java.time.LocalDate; //ctrl, shift + o = import class libraries

public class Student {
	
	/*
	 * Define some state for the class Student.
	 * These are all **instance variables**
	 * 
	 * Public visibility modifier for instance 
	 * variables used for example purposes ONLY
	 * 
	 */
	
	public long sid;
	public String name = "Undefined"; //not a great name, for example purposes
	public LocalDate dob;
	
	public Student() {
		System.out.println("The ID of the Student object is " + this);
	}
	
	/*
	 * "this" is a keyword = show me my ID
	 */
	
}

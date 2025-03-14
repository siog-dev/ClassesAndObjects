package ie.atu.sw;

import java.time.LocalDate; //ctrl, shift + o = import class libraries

public class Student {
	
	/*
	 * Define some state for the class Student.
	 * These are all **instance variables**
	 * 
	 * Public visibility modifier for instance 
	 * variables used for example purposes ONLY
	 */
	
	private long sid; //change instance variable to private, state should be private
	/*
	 * error: "The value of the field Student.sid is not used"
	 * private sid no longer visible in Runner, no longer usable as a value
	 */
	public String name = "Undefined";
	public LocalDate dob;
	public boolean registered = false;
	
	
	public Student() {
		System.out.println("The ID of the Student object is " + this);
	}
	
	//Add some methods - things a class can **do** (behaviours)
	protected void register() {
		this.registered = true;
	}
	
	protected void study() {
		System.out.println("Studying...");
	}
	
	public void execute() {
		System.out.println("Execute");
	}
	
}

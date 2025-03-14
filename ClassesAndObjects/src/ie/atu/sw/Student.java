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
	
	public long sid;
	public String name = "Undefined"; //not a great name, for example purposes
	public LocalDate dob;
	public boolean registered = false;
	
	
	public Student() {
		System.out.println("The ID of the Student object is " + this);
	}
	
	//Add some methods - things a class can **do** (behaviours)
	protected void register() { //protected visibility will still be visible in Runner class
		this.registered = true;
	}
	
	protected void study() { //change to protected visibility
		System.out.println("Studying...");
	}
	
	public void execute() { //Bad name, execute who? the students?
		System.out.println("Execute");
	}
	
}

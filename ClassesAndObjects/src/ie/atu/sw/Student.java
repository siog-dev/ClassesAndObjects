package ie.atu.sw;

import java.time.LocalDate; //ctrl, shift + o = import class libraries

public class Student {
	
	/*
	 * Define some state for the class Student.
	 * These are all **instance variables**
	 */
	
	private long sid;
	private String name = "Undefined";
	private LocalDate dob;
	private boolean registered = false;
	
	
	public Student() {
		System.out.println("The ID of the Student object is " + this);
	}
	
	//Add some methods - things a class can **do** (behaviors)

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean isRegistered() {
		return registered;
	}

	/*
	 * setRegistered INFO
	 * 
	 * registered: instance variable = used to store a value
	 * 
	 * setRegistered: method = is updating the value of "registered"
	 * reg: method parameter = used to receive the value passed to the method when called
	 * 	(method parameter: temporary variable used within the method)
	 * the value is then assigned to this.registered
	 * 
	 */
	public void setRegistered(boolean reg) {
		this.registered = reg;
	}
	
	protected String study(double hours, int level) {
		double total = hours * level;
		String message = "Studying..." + total; //local scope, generic name ("message") sufficient
		return message; //this is not being "caught" in the Runner class
	}
	
	public boolean execute(String command) {
		System.out.println("Executing " + command);
		
		return command.endsWith("!"); //my string ends with an exclamation mark, true or false?
	}
	
}

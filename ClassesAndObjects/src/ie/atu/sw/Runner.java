package ie.atu.sw;

import java.time.LocalDate;

public class Runner {
	
	public static void main(String[] args) {
		/*
		 * Student is our variable, it's a type, it has an identifier "s"
		 * it is assigned a legal value for it's type: "new Student()"
		 */
		Student s = new Student(); //Use the new keyword against a constructor
		
		/*
		 * The new keyword creates an instance of a class. An
		 * Instance of a class is called an object.
		 */
		
		System.out.println("Student Object ID from Runner: " + s);
		s.sid = 99999; //Use dot notation to access instance variables (ctrl + space)
		s.name = "Joe Murphy";
		s.dob = LocalDate.now();
	}
	
}

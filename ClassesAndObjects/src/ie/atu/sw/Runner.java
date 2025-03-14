package ie.atu.sw;

import java.time.LocalDate;

public class Runner {
	
	public static void main(String[] args) {

		Student s = new Student(); //Use the new keyword against a constructor
		
		/*
		 * The new keyword creates an instance of a class. An
		 * Instance of a class is called an object.
		 */
		
		System.out.println("Student Object ID from Runner: " + s);
		
		//Use the dot notation to access features
		s.sid = 99999; 
		s.name = "Joe Murphy";
		s.dob = LocalDate.now();
		
		//Also use the dot notation to invoke methods
		s.register();
		s.study();
		s.execute();
		
		//Access the state
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.dob);
		System.out.println(s.registered);
		
	}
	
}

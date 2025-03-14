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
		s.sid = 99999; //error introduced, private instance variable in Student class no longer visible in Runner
		s.name = "Joe Murphy"; //error introduced
		s.dob = LocalDate.now(); //error introduced
		
		//Also use the dot notation to invoke methods
		s.register();
		s.study();
		s.execute();
		
		//Access the state
		System.out.println(s.sid); //error
		System.out.println(s.name); //error
		System.out.println(s.dob); //error
		System.out.println(s.registered); //error
		
	}
	
}

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
		s.setSid(9999);
		s.setName("Joe Murphy");
		s.setDob(LocalDate.now());
		
		//Also use the dot notation to invoke methods
		s.setRegistered(true);
		String msg = s.study(2.25d, 8);
		System.out.println(msg);
		
		/*
		 * call a method, use return type to initialize a variable
		 * boolean type with an identifier
		 * res is assigned a legal value for the type
		 */
		
		boolean res = s.execute("Study please...!"); //true, my string ends with an exclamation mark
		System.out.println("Has Prefix: " + res);
		
		//Access the state
		System.out.println(s.getSid());
		System.out.println(s.getName());
		System.out.println(s.getDob());
		System.out.println(s.isRegistered());
		
	}
	
}

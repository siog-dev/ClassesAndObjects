package ie.atu.sw;

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
		//Prints: "Student Object ID from Runner: ie.atu.sw.Student@372f7a8d"
	}
	
}

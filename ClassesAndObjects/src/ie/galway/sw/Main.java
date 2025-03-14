package ie.galway.sw;

import ie.atu.sw.Student; //Import Student class from ie.atu.sw package

public class Main {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.study(); //Public method(behavior) "study" accessible
		System.out.println(s.registered); //Public instance variable(state) "registered" accessible
		s.register() //Protected method(behavior) NOT accessible
	}

}

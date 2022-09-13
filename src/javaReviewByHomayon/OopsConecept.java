package javaReviewByHomayon;

public class OopsConecept {

	public static void main(String[] args) {
		
		/*
		 * Object oriented programming:
		 * 1) Inheritance
		 * 2) Encapsulation 
		 * 3) Polymorphism
		 * 4) Abstraction 
		 */
		
		// class is the blue print and object is the copy of it.
		
		/*
		 * Members of the class are: method and variables
		 * you usually put your variables on the top
		 * then you put your constructor (default , parameterized ) after it
		 * 
		 * constructor: initialize all the variable in the class. and you have one default 
		 * constructor that comes when you don't have any other constructor, constructor 
		 * doesn't have return type
		 * 
		 * what is the signature of the constructor : the name and parameterize of a mehtod 
		 * is called signature
		 * 
		 * Definition of the code is whatever before the body of the method, when you are 
		 * calling the method you match the signature of the method.
		 */
		
		// this => refers to the scope of the current class
		// super keyword => referees to the parent scope
		
		/*
		 * the parameterize are the input of your method.
		 */
		
		/*
		 * Encapsulation is the idea of hiding your data it gives you control over data
		 * we can make private and access it by public method, making private mean you can
		 * access it only in the same class.
		 * 
		 */
		
		/*
		 * inheritance: 
		 * you are getting a copy of everything form parent class, you can only inherit from 
		 * one parent class. you can not have 2 parent class, but not constructor
		 * object is the parent of all the classes
		 * 
		 * Extends keyword 
		 * super keyword 
		 */
		
		/*
		 * Abstraction =>
		 * simplifying,  
		 * interface is 100% abstraction
		 * Abstraction is providing the definition but not implemention.
		 * interface is a java file and it is used to achieve abstraction
		 * 
		 */
		
		/*
		 * your abstract class can have abstract or non abstract method class, so you need 
		 * to mention abstract keyword but in interface they are abstaract by default
		 * implements keyword you can inherit many to many inteface
		 */
		
		/*
		 * Polymorphism
		 * is the idea of getting code in different shape
		 * overloading
		 * overriding
		 */
		
		/*
		 * up casting:
		 * declare parent = initiialize any of child classes
		 * obj obj = new Student();
		 * 
		 * 		 */
		
	/*
	 * dynamic variable belong to the object of the class => object.name of the method
	 * static variable belong to the class itself, so you don't need the object, 
	 * you call the name of the class and then name of the metod
	 */
		
		
		
	}

	// Encapsulation
	
	private String firstName;
	
	public String getFirstName (String Pass) {
		if (Pass.equals("pasword123")) {
			return firstName;
		} else {
			return "Wrong Password";
		}
	}
	
	
}

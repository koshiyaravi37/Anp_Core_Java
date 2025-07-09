/* 
Create a superclass Animal with a method makeSound().
Create two subclasses Dog and Cat that override the method.
 */

package ksy_java;

//Superclass 'animal'
class animal {

	// Method to be overridden by subclasses
	void makeSound() {
		System.out.println("Animal Makes a Sound");
	}
}

//Subclass 'dog' that extends 'animal'
class dog extends animal {

	// Overriding makeSound() method
	void makeSound() {
		System.out.println("Dog Barks");
	}
}

//Subclass 'cat' that extends 'animal'
class cat extends animal {

	// Overriding makeSound() method
	void makeSound() {
		System.out.println("Cat Meows");
	}
}

//Main class to test method overriding
public class Method_overriding {

	public static void main(String[] args) {

		// animal obj0 = new animal();
		// obj0.makeSound();  

		// dog obj1 = new dog();
		// obj1.makeSound();  

		// Create object of cat class
		cat obj2 = new cat();
		obj2.makeSound();  
	}
}


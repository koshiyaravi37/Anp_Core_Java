/*.Write a Java program to demonstrate method overloading by creating a class Calculator with multiple add() methods that accept different parameter types.
 */

//Define the package name
package ksy_java;

//Create a public class named Method_overloading
public class Method_overloading {

 // Method to add two integers
 // This method takes two int parameters and prints their sum
 void add(int a, int b) {
     System.out.println("Addition of Two Numbers = " + (a + b));
 }

 // Overloaded method to add three integers
 // This method takes three int parameters and prints their sum
 void add(int a, int b, int c) {
     System.out.println("Addition of Three Numbers = " + (a + b + c));
 }

 // Main method: Entry point of the program
 public static void main(String[] args) {

     // Create an object of Method_overloading class
     Method_overloading obj1 = new Method_overloading();

     // Call the add method with 2 arguments
     obj1.add(10, 35);  // This will call the method that adds two numbers

     // Call the add method with 3 arguments
     obj1.add(10, 35, 5);  // This will call the overloaded method that adds three numbers
 }
}


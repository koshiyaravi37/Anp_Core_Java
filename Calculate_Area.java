/*Write a Java program to calculate area using method overloading for the following shapes:

Circle (radius)

Rectangle (length, breadth)

Triangle (base, height)

Use the method area() with different parameters.
*/

package ksy_java;


public class Calculate_Area {

	// calculate area of circle
	void area(int radius) {
		System.out.println("Area of Circle = "+(radius*radius));	
	}
	
	// calculate area of Rectangle
	void area(double l, double b) {
		System.out.println("Area of Rectangle = "+(l*b));	
	}
	
	// calculate area of Triangle
	void area(int h, int b) {
		System.out.println("Area of Triangle = "+(0.5*h*b));	
	}


	public static void main(String[] args) {

		Calculate_Area obj= new Calculate_Area();

		obj.area(12);
		obj.area(12.10,12);
		
		obj.area(13,12);

	}

}

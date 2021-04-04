/*
 * Assignment 2_2
 * WAP to find the area and Perimeter of Rectangle & Circle.
 */

package neha_Rathi.assignment2;

class Operation {
	float pi = 3.1416f;
	float areaCircle;
	float areaRectangle;
	float perimeterCircle;
	float perimeterReactangle;

	void area(int num1, int num2) {
		areaCircle = pi * num1 * num1;
		areaRectangle = num1 * num2;
	}

	void perimeter(int num1, int num2) {
		perimeterCircle = 2 * pi * num1;
		perimeterReactangle = 2 * (num1 + num2);
	}

	void display() {
		System.out.println("Area of Reactangle is: " + areaRectangle);
		System.out.println("Perimeter of Reactangle is: " + perimeterReactangle);
		System.out.println("Area of Circle is: " + areaCircle);
		System.out.println("Perimeter of Circle is: " + perimeterCircle);
	}

	public static void main(String[] args) {
		Operation operation = new Operation();
		operation.area(4, 6);
		operation.perimeter(4, 6);
		operation.display();
	}
}
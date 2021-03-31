//WAP to find the area and perimeter of Rectangle & Circle*.  NOTE : one method to calculate area and another for perimeter.
package krati_Jain;

class Assignment2Perimeter {
	float pi = 3;
	float recArea;
	float circleArea;
	float recPerimeter;
	float circlePerimeter;
	
	void area(int length, int width, int radius) {
	recArea = length * width;
	circleArea = pi * radius * radius; 
	System.out.println("Area of rectangle is: " + recArea);
	System.out.println("Area of circle is: " + circleArea);
	}
	
	void perimeter(int length, int width, int radius) {	
	recPerimeter = 2*length + 2*width;
	circlePerimeter = 2 * pi * radius;
	System.out.println("Perimeter of rectangle is: " + recPerimeter);
	System.out.println("Perimeter of circle is: " + circlePerimeter);
	}
	
	public static void main(String[] a) {
	Assignment2Perimeter assignment2Perimeter = new Assignment2Perimeter();
	assignment2Perimeter.area(4, 6, 8);
	assignment2Perimeter.perimeter(4, 6, 8);
	}
}

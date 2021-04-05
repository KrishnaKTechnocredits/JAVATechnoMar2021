package kangan.assignments.assignment2;

public class AreaPerimeter {

	void Rectangle(double length, int width) {
		double areaRec = length*width;
		double perimeterRec = 2*(length +width);
		System.out.println("Area of rectangle is : " + areaRec);
		System.out.println("Perimeter of rectangle is :" + perimeterRec);
	}
	void Circle(double radius) {
		double areaCircle = 3.14*radius*radius;
		double perimeterCircle = 2*3.14*radius;
		System.out.println("Area of circle is : " + areaCircle);
		System.out.println("Perimeter of circle is : " + perimeterCircle);
	}
	public static void main(String[] args) {
		AreaPerimeter areaPerimeter = new AreaPerimeter();
		areaPerimeter.Rectangle(3.5,2);
		areaPerimeter.Circle(2);
		}
}

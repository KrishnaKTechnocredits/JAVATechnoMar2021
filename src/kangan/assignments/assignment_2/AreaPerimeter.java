package kangan.assignments.assignment_2;

public class AreaPerimeter {

	void rectangle(double length, int width) {
		double areaRec = length*width;
		double perimeterRec = 2*(length +width);
		System.out.println("Area of rectangle is : " + areaRec);
		System.out.println("Perimeter of rectangle is :" + perimeterRec);
	}
	void circle(double radius) {
		double areaCircle = 3.14*radius*radius;
		double perimeterCircle = 2*3.14*radius;
		System.out.println("Area of circle is : " + areaCircle);
		System.out.println("Perimeter of circle is : " + perimeterCircle);
	}
	public static void main(String[] args) {
		AreaPerimeter areaPerimeter = new AreaPerimeter();
		areaPerimeter.rectangle(3.5,2);
		areaPerimeter.circle(2);
		}
}

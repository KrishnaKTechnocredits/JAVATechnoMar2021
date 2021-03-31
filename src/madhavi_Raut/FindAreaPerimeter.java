/*
Assignment 02
Program 02
WAP to find the area and perimeter of Rectangle & Circle.
	NOTE : one method to calculate area and another for perimeter.
	HINT :
	Rectangle area = length * width
	Rectangle perimeter = 2*Length + 2*Width
	Circle area = pi*r*r, where r is radius
	Circle perimeter = 2*pi*r , where pi = 3.1416
*/

package madhavi_Raut;

class FindAreaPerimeter {

	double pi = 3.14;

	void findAreaOfRectangle(int length, int width) {
		System.out.println("Area of Rectangle: " + length * width);
	}

	void findPerimeterOfRectangle(int length, int width) {
		System.out.println("Perimeter of Rectangle: " + ((2 * length) + (2 * width)));
	}

	void findAreaOfCircle(int radius) {
		System.out.println("Area of Circle: " + (pi * radius * radius));
	}

	void findPerimeterOfCircle(int radius) {
		System.out.println("Perimeter of Circle: " + (2 * pi * radius));
	}

	public static void main(String[] args) {
		FindAreaPerimeter FindAreaPerimeter = new FindAreaPerimeter();
		FindAreaPerimeter.findAreaOfRectangle(2, 4);
		FindAreaPerimeter.findPerimeterOfRectangle(2, 4);
		FindAreaPerimeter.findAreaOfCircle(10);
		FindAreaPerimeter.findPerimeterOfCircle(10);
	}
}
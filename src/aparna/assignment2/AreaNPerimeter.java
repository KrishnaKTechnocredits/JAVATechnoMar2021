/*
2. WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416
*/
package aparna.assignment2;

class AreaNPerimeter {

	double pi = 3.1416;

	void rectangleAreaNPerimeter(int length, int width) {
		int rectangleArea = length * width;
		int rectanglePerimeter = 2 * (length + width);
		System.out.println("Area of Rectangle is :-> " + rectangleArea);
		System.out.println("Perimeter of Rectangle is:-> " + rectanglePerimeter);

	}

	void circleAreaNPerimeter(double radius) {

		double circleArea = pi * radius * radius;
		double circlePerimeter = 2 * pi * radius;
		System.out.println("Area of Circle is :-> " + circleArea);
		System.out.println("Perimeter of Circle is:-> " + circlePerimeter);
	}

	public static void main(String[] args) {
		AreaNPerimeter areaNPerimeter = new AreaNPerimeter();
		areaNPerimeter.rectangleAreaNPerimeter(2, 4);
		areaNPerimeter.circleAreaNPerimeter(5);

	}
}
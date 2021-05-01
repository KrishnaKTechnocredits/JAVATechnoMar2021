/*WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416 
*/

package parakh.Assignment2;

public class CalculateAreaPerimeter {
	
	double pi = 3.1416;
	
	void calculateRectangleArea(int length, int breadth) {
		System.out.println("Area of Rectangle: " + length * breadth);
	}
	
	void calculateRectanglePerimeter(int length, int breadth) {
		System.out.println("Perimeter of Rectangle: " + ((2*length) + (2*breadth)));
	}
	
	void calculateAreaCircle(int radius) {
		System.out.println("Area of Circle: " + pi * radius * radius);
	}
	
	void calculateCirclePerimeter(int radius) {
		System.out.println("Area of Circle: " + 2* pi * radius);
	}
	
	public static void main(String args[]) {
		CalculateAreaPerimeter calculateAreaPerimeter = new CalculateAreaPerimeter();
		calculateAreaPerimeter.calculateRectangleArea(10,5);
		calculateAreaPerimeter.calculateRectanglePerimeter(10,5);
		calculateAreaPerimeter.calculateAreaCircle(10);
		calculateAreaPerimeter.calculateCirclePerimeter(10);
	}
}

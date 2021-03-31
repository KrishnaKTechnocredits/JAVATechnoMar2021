//WAP to find the area and perimeter of Rectangle & Circle. 
//NOTE : one method to calculate area and another for perimeter.
//HINT : 
//Rectangle area = length * width
//Rectangle perimeter = 2*Length + 2*Width 
//	   Circle area = pi*r*r, where r is radius
//	   Circle perimeter = 2*pi*r , where pi = 3.1416

package anubhav;

class Geometry{
	double pi=3.1416;
	
	void perimeter (int length, int width, int radius){
		int rectanglePerimeter= ((2*length) + (2*width));
		System.out.println("Perimter of rectangle is " + rectanglePerimeter);
		double circlePerimeter= (2*pi*radius);
		System.out.println("Perimter of circle is " + circlePerimeter);
	}
	
	void area (int length, int width, int radius){
		int rectangleArea= (length*width);
		System.out.println("Area of rectangle is " + rectangleArea);
		double circleArea= (pi*radius*radius);
		System.out.println("Area of circle is " + circleArea);
	}
	
	public static void main (String[] args){
		Geometry geometry = new Geometry();
		geometry.perimeter(10,10,10);
		geometry.area(10,10,10);
	}
} 	
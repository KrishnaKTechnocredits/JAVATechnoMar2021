/*
WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416
 */
package ravindra_J;  
class Rectangle_Circle{
	double pi = 3.1416;
	void areaOfRectangle(int num1,int num2){
		int length = num1;
		int width = num2;
		int rectangleArea = length + width;
		System.out.println("Area of rectangle is - "+rectangleArea);
	}
	void areaOfCircle(int num1){
		int r = num1;
		double circleArea = pi*r*r;
		System.out.println("Area of Circle is - "+circleArea);
	}
	void perimeterOfRectangle(int num1,int num2){
		int length = num1;
		int width = num2;
		int rectanglePerimeter = 2*length + 2*width;
		System.out.println("Perimeter of rectangle is - "+rectanglePerimeter);
	}
	void perimeterOfCircle(int num1){
		int r = num1;
		double circlePerimeter = 2*pi*r;
		System.out.println("Perimeter of Cirle is - "+circlePerimeter);
	}
	public static void main(String []args){
		Rectangle_Circle rectangle_circle = new Rectangle_Circle();
		rectangle_circle.areaOfRectangle(25,56);
		rectangle_circle.areaOfCircle(12);
		rectangle_circle.perimeterOfRectangle(23,45);
		rectangle_circle.perimeterOfCircle(99);
	
	}
}
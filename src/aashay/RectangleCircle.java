package aashay;
/*
 * WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416
 */

class RectangleCircle{
	int length,width;
	float pi = 3.14f;
		
	void areaRectangle(int num1, int num2){
		int rectangleArea = num1 * num2;
		System.out.println("Area of a Rectangle is:"+rectangleArea);
	}
	void areaCircle(int num1, int num2){
		float circleArea = pi*num1*num2;
		System.out.println("Area of a Circle is:"+circleArea);
	}
	void perimeterRectangle(int num1, int num2){
		int rectanglePerimeter =  (2*num1) + (2*num2) ;
		System.out.println("Perimeter of a Rectangle is:"+rectanglePerimeter);
	}
	void perimeterCircle(int num1){
		float circlePerimeter = 2*pi*num1;
		System.out.println("Perimeter of a Circle is:"+circlePerimeter);
	}
	public static void main(String[] args){
		RectangleCircle rc = new RectangleCircle();
		rc.areaRectangle(2,2);
		rc.areaCircle(2,2);
		rc.perimeterRectangle(2,2);
		rc.perimeterCircle(2);
	}
	
}
package ankit;

/*2. WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416 
	   */

class AreaParimeterCircleAndRectangle{

	void circleCalculations(int r){
		double pi = 3.1416;
		double area = (pi * r * r); 
		double perimeter = (2 * pi * r);
		System.out.println("Entered Radius of Circle is " + r);
		 System.out.println("Area of Circle is " + area);
		 System.out.println("Paremeter of Circle is " + perimeter);
	}
	
	void rectangleCalculations(int l, int b){
	     int area = l*b;
		 int perimeter = (2*l+2*b);
		 System.out.println("Entered value of Length is "+ l);
		 System.out.println("Entered value of Breadth is "+ b);
		 System.out.println("Area of Rectangle is " + area);
		 System.out.println("Paremeter of Rectangle is " + perimeter);
	}
	
	public static void main(String[] args){
		AreaParimeterCircleAndRectangle areaParimeterCircleAndRectangle = new AreaParimeterCircleAndRectangle();
		areaParimeterCircleAndRectangle.circleCalculations(5);
		areaParimeterCircleAndRectangle.rectangleCalculations(10,20);
	}
}
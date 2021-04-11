//2. WAP to find the area and perimeter of Rectangle & Circle. 
//NOTE : one method to calculate area and another for perimeter.
//HINT : 
//Rectangle area = length * width
//Rectangle perimeter = 2*Length + 2*Width 
//	   Circle area = pi*r*r, where r is radius
//	   Circle perimeter = 2*pi*r , where pi = 3.1416

/*
Assignment 2 - Program 2 - Program Statement : WAP to find the area and perimeter of Rectangle & Circle.
*/

package paras.Assignment_2;

class Calculate{

	void rectangle(int length, int width){
		int rectangleArea = length*width;
		int rectanglePerimeter = 2*length + 2*width;
		System.out.println("Rectangle Area is " + rectangleArea);
		System.out.println("Rectangle perimeter is " + rectanglePerimeter);
	}
	
	void circle(float pi, float r){
		float circleArea = pi*r*r;
		float circlePerimeter = 2*pi*r;
		System.out.println("Circle Area is " + circleArea);
		System.out.println("Circle perimeter is " + circlePerimeter);
	}
	
	public static void main(String[] args){
		Calculate calculate = new Calculate();
		calculate.rectangle(10,10);
		calculate.circle(3.1416f,5.5f);
	}
}
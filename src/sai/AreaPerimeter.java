package sai;

class AreaPerimeter{

	void circle(int r){
		float pi = 3.1416f;
		float circleArea = pi*r*r;
		System.out.println("Area of the circle is " + circleArea);
		float circlePerimeter = 2*pi*r;
		System.out.println("Preimeter of the circle is " + circlePerimeter);
	}
	
	void rectangle(int length, int breadth){
		int rectangleArea = length*breadth;
		System.out.println("Area of the rectangle is " + rectangleArea);
		int rectanglePerimeter = 2*length + 2*breadth;
		System.out.println("Preimeter of the rectangle is " + rectanglePerimeter);	
	}
	
	public static void main(String[] args){	
		AreaPerimeter ap = new AreaPerimeter();
		ap.circle(3);
		ap.rectangle(3,4);
	}
}
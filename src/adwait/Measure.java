package adwait;

class Measure{
	
	void area(int length, int width, double radius){
		int rectanglearea = length*width;
		double circlearea = 3.14*radius*radius;
		System.out.println("Area of Rectangle is: "+rectanglearea);
		System.out.println("Ares of Circle is: "+circlearea);
	}
	
	void perimeter(int length, int width, double radius){
		int rectangleperimeter = 2*length + 2*width;
		double circleperimeter = 2*3.14*radius;
		System.out.println("Perimeter of Rectangle is :"+rectangleperimeter);
		System.out.println("Perimeter of Circle is: "+circleperimeter);
	}
	
	public static void main (String [] args){
		Measure measure = new Measure ();
		measure.area(3,4,5);
		measure.perimeter(3,4,5);
	}
}
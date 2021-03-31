package dipali;

public class FindAreaAndPerimeterOfShapes{
	double pi=3.1416;
	
	void calculateArea(int length,int width,double radius){
		int rectangleArea=length*width;
		System.out.println("Area of rectangle is ["+rectangleArea+"]");
		
		double circleArea=pi*radius*radius;
		System.out.println("Area of circle is ["+circleArea+"]");
	}
	
	void calculatePerimeter(int length,int width,double radius){
		int rectanglePerimeter=2*length+2*width;
		System.out.println("Perimeter of rectangle is ["+rectanglePerimeter+"]");
		
		double circlePerimeter=2*pi*radius;
		System.out.println("Perimeter of circle is ["+circlePerimeter+"]");
	}
	
	public static void main(String []args){
		FindAreaAndPerimeterOfShapes obj=new FindAreaAndPerimeterOfShapes();
		obj.calculateArea(2,2,2.5);
		obj.calculatePerimeter(3,3,2.5);
	}
}
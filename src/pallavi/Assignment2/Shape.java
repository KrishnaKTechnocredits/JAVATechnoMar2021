package pallavi.Assignment2;
class Shape{
	
	double length;
	double width;
	double radius;
	double areaOfRectangle;
	double areaOfCircle;
	double periOfCircle;
	double periofRectangle;
	double pi=3.1416; 
	

	void area(double radius,double length,double width){
	areaOfCircle=pi*radius*radius;
	System.out.println("Area of circle is = " +areaOfCircle);
	areaOfRectangle =length * width;
	System.out.println("Area of rectangle is  = " + areaOfRectangle);
	}
	
	
	void perimeter(double radius,double length,double width){
	periOfCircle=2*pi*radius;
	System.out.println("Perimeter of circle is = " +periOfCircle);
	periofRectangle=2*length+2*width;
	System.out.println("Perimeter of rectangle is  = " + periofRectangle);
	}

	public static void main(String args[]){
	Shape shape = new Shape();
	shape.area(5,240,70);
	shape.perimeter(7,10,10);
	
		
	}
	
}
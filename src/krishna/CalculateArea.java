package krishna;
class CalculateArea{
	double pi=3.1416;
	
	void rectangleArea(int length, int width){
		int area;
		area = length*width;
		System.out.println("Area of rectangle is:"+area);
	}
	void rectanglePerimeter(int length, int width){
		int perimeter;
		perimeter = 2*length + 2*width;
		System.out.println("Perimeter of rectangle is:"+perimeter);
	}
	void circleArea(int r){
		double area;
		area = pi*r*r;
		System.out.println("Area of circle is:"+area);
	}
	void circlePerimeter(int r){
		double perimeter;
		perimeter = 2*pi*r;
		System.out.println("Perimeter of circle is:"+perimeter);
	}
	public static void main(String[] args){
		CalculateArea calculateArea= new CalculateArea();
		calculateArea.rectangleArea(5,5);
		calculateArea.rectanglePerimeter(10,10);
		calculateArea.circleArea(8);
		calculateArea.circlePerimeter(9);
	}
}
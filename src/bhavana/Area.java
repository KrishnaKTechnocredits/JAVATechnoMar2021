package bhavana;
class Area{
	void rectangleArea(int length, int width){
		int area;
		area=length*width;
		System.out.println("Area of the rectangle is:" +area);
	}
	
	void rectanglePerimeter(int length, int width){
		int perimeter;
		perimeter=(2*length)+(2*width);
		System.out.println("Perimeter of the rectangle is:" +perimeter);
	}
	void circleArea(float radius){
		float area;
		float pi=3.14f;
		area=pi*radius*radius;
		System.out.println("Area of circle is:" +area);
	}
	
	void circlePerimeter(float radius){
		float perimeter;
		float pi=3.14f;
		perimeter=2*pi*radius;
		System.out.println("Perimeter of the circle is:" +perimeter);
	}
	
	public static void main(String [] args){
		Area a = new Area();
		a.rectangleArea(5,6);
		a.rectanglePerimeter(8,9);
		a.circleArea(9);
		a.circlePerimeter(6);
	}
}
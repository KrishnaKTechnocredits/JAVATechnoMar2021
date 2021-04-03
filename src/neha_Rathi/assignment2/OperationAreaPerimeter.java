package neha_Rathi.assignment2;

class OperationAreaPerimeter{
	float pi = 3.1416f;
	float areaCircle;
	float areaRectangle;
	float perimeterCircle;
	float perimeterReactangle;
	
	void circle(int radius){
		areaCircle = pi*radius*radius;
		perimeterCircle = 2*pi*radius;
	}
	
	void rectangle(int length, int width){
		areaRectangle = length*width;
		perimeterReactangle = 2*(length+width);
	}
	
	void display(){
		System.out.println("Area of Reactangle is: "+areaRectangle);
		System.out.println("Perimeter of Reactangle is: "+perimeterReactangle);
		System.out.println("Area of Circle is: "+areaCircle);
		System.out.println("Perimeter of Circle is: "+perimeterCircle);
	}
	
	public static void main(String[] args){
		OperationAreaPerimeter operationAreaPerimeter = new OperationAreaPerimeter();
		operationAreaPerimeter.circle(4);
		operationAreaPerimeter.rectangle(4,6);
		operationAreaPerimeter.display();
	}
}
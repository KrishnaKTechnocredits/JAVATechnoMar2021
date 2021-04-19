package sandesh.Assignment_2;

public class RectangleCircle {
	float pi = 3.1416f;
	
	void areaRectangle(int length, int width) {
		int areaRect = (length * width);
		System.out.println("Area of rectangle having length " + length + " and width " + width + " is " + areaRect);
	}
	
	void perimeterRectangle(int length, int width) {
		int perimeterRectangle = (2 * (length + width));
		System.out.println("Perimeter of rectangle having length " + length + " and width " + width + " is " + perimeterRectangle);
	}
	
	void areaCircle(int radius) {
		float areaCircle = (pi * radius * radius);
		System.out.println("Area of circle having radius " + radius + " is " + areaCircle);
	}
	
	void perimeterCircle(int radius) {
		float perimeterCircle = (2 * pi * radius);
		System.out.println("Perimeter of circle having radius " + radius + " is " + perimeterCircle);
	}
	
	public static void main(String[] args) {
		RectangleCircle rc1 = new RectangleCircle();
		int rectLength = 10;
		int rectWidth = 6;
		int circleRadius = 7;
		rc1.areaRectangle(rectLength, rectWidth);
		rc1.perimeterRectangle(rectLength, rectWidth);
		rc1.areaCircle(circleRadius);
		rc1.perimeterCircle(circleRadius);
	}
}

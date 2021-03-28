package rahul_hiremath;

class Ass_2_2
{
	double pi = 3.1416;
	void cPerimeter(int r){
		double circlePerimeter = pi*r*r;
		System.out.println("Circle Perimeter" + circlePerimeter);
	}
	void circleArea(int r){
		double cArea = pi*r*r;
		System.out.println("Circle Area" + cArea);
	}
	void rectangleArea(int length, int width){
		int rArea = length * width;
		System.out.println("Rectangle area: " + rArea);
	}
	void rectanglePerimeter(int length, int width){
		int rPerimeter = 2 * length + 2 * width;
		System.out.println("Rectangle Perimeter: " + rPerimeter);
	}
	public static void main (String[] args){
		Ass_2_2 cirRect = new Ass_2_2();
		cirRect.cPerimeter(2);
		cirRect.circleArea(3);
		cirRect.rectangleArea(4,5);
		cirRect.rectanglePerimeter(6,7);	
	}
}
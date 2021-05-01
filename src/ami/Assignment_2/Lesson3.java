package ami.Assignment_2;
//find the area and perimeter of rectangle & circle.

class Lesson3{
	void rectangle(int L ,int W){
		int area = L * W;
		int perimeter = (2*L) + (2*W);
		System.out.println("rectangle area : " + area);
		System.out.println("rectangle perimeter : " + perimeter);
	}
	
	void circle(int r){
		double pi = 3.1416;
		double area = pi * r * r;
		double perimeter = 2 * pi * r;
		System.out.println("circle area : " + area);
		System.out.println("circle perimeter : " + perimeter);
	}
	
	public static void main(String[] a){
		Lesson3 lesson3 = new Lesson3();
		lesson3.rectangle(2,3);
		lesson3.circle(5);
	}
}
package monika.Practise1.Ass2;
/* Assignment2:
2. WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 

	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416

Create parameterized methods if possible.*/
public class Test2 {
	double pi = 3.1416;
	int areaOfRectangle(int length, int width) {
		return length*width;
	}
	
	int perimeterOfRectangle(int length, int width) {
		return 2*(length+width);
	}
	
	double areaOfCircle(int radius) {
		return pi*radius*radius;
	}
	
	double perimeterOfCircle(int radius) {
		return 2*pi*radius;
	}
	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		int areaOfRect = obj.areaOfRectangle(10, 20);
		int perimeterOfRect = obj.perimeterOfRectangle(10, 20);
		double areaOfCircle = obj.areaOfCircle(2);
		double perimeterOfCircle = obj.perimeterOfCircle(3);
		System.out.println(areaOfRect +"\n "+perimeterOfRect+"\n"+areaOfCircle+"\n"+perimeterOfCircle );
	}

}

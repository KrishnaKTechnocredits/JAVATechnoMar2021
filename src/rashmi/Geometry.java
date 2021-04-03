package rashmi;
public class Geometry{
	
		void Rectangle(int length, int width){
			int perimeter = 2*length + 2*width;
			int area = length * width;
			System.out.println("Perimeter of rectangle is "+ perimeter);
			System.out.println("Area of rectangle is "+ area);
		}
		
		void Circle(int radius){
			int pi = 3;
			int perimeter = 2 * pi * radius;
			int area = pi * radius * radius;
			System.out.println("Perimeter of circle is " + perimeter);
			System.out.println("Area of circle is " + area);
		}
		
		public static void main(String[] args){
			Geometry geometry = new Geometry();
			geometry.Rectangle(2,4);
			geometry.Circle(5);
		}
	}
/* 
 2. WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416
 */
package amruta.Assignment_2;

   
class CircleRectangle{
	
	static double pi = 3.1416;
	
	void Rectangle(int length, int width){
		int area = length*width;
		int perimeter = (2*length) + (2*width);
		System.out.println("Area of Rectangle is : "+area);
		System.out.println("Perimeter of Rectangle is : "+perimeter);
		
		System.out.println("---------------------------------");
	}
	
	void Circle(int radius){
		//double pi = 3.1416;
		double area = pi*radius*radius;
		double perimeter  = 2*pi*radius;
		System.out.println("Area of Circle is : "+area);
		System.out.println("Perimeter of Circle is : "+perimeter);
	}
	
	public static void main(String[] args){
		CircleRectangle cr1 = new CircleRectangle();
		cr1.Rectangle(2,3);	
		cr1.Circle(4);
	}
}
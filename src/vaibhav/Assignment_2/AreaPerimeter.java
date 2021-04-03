
/*Java Assignment 2: 22nd March 2021

2. WAP to find the area and perimeter of Rectangle & Circle.
NOTE : one method to calculate area and another for perimeter.
HINT :
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width
Circle area = pi*r*r, where r is radius
Circle perimeter = 2*pi*r , where pi = 3.1416


 */

package vaibhav.Assignment_2;

class AreaPerimeter{
		
	void rectangle (float l, float w){
		float recArea = l*w;
		float recPerimeter = 2*l + 2*w ;
		System.out.println("Area of Rectangle is : " + recArea + " unit square");
		System.out.println("Perimeter of Rectangle is : " + recPerimeter + " unit");
	}

	void circle (float r){
		float pi = 3.1416f; 
		float cirArea = pi*r*r;
		float cirPerimeter = 2*pi*r;
		System.out.println("Area of Circle is : " + cirArea + " unit square");
		System.out.println("Perimeter of Circle is : " + cirPerimeter + " unit");
	}
	
	public static void main (String[] args){
		AreaPerimeter areaPerimeter = new AreaPerimeter();
		areaPerimeter.rectangle(10,11);
		areaPerimeter.circle(2);
	}
}
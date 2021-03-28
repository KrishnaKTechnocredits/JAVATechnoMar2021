package monika;

/* Assignment2:
2. WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 

	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416

Create parameterized methods if possible.*/

class FindAreaPerimeter{
	double pi = 3.1416;
void rectangle(int length, int width){
	int rectanglearea = length*width;
	int rectangleperimeter = 2*(length+width);
	System.out.println("Area of a rectangle is: " +rectanglearea);
	System.out.println("Perimeter of a rectangle is: " +rectangleperimeter);
}
void circle(int radius){
	double circlearea = pi*radius*radius;
	double circleperimeter = 2*pi*radius;
	System.out.println("Area of a rectangle is: " +circlearea);
	System.out.println("Perimeter of a rectangle is: " +circleperimeter);
}
public static void main(String[] args){
	FindAreaPerimeter areaperimeter = new FindAreaPerimeter();
	areaperimeter.rectangle(2,4);
	areaperimeter.circle(1);
}
}
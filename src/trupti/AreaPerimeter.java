package trupti;
/*Assignment 2 : WAP to find the area and perimeter of Rectangle & Circle.
 * NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416
 */
class AreaPerimeter{
	double pi=3.1416;
	
	void rectanglearea(int x,int y){
		int area=x*y;
		System.out.println("Area of rectangle is :"+area);
	}
	void rectangleperi(int a,int b){
		int perimeter=2*a+2*b;
		System.out.println("Perimeter of rectangle is :"+perimeter);
	}
	void circlearea(int r){
		double cirarea=pi*r*r;
		System.out.println("Area of circle is :"+cirarea);
	}
	void circleperimeter(int r){
		double cirperimeter=2*pi*r;
		System.out.println("Perimeter of circle is :"+cirperimeter);
	}	

	public static void main(String[] args){
		AreaPerimeter areaperimeter=new AreaPerimeter();
		areaperimeter.rectanglearea(4,3);
		areaperimeter.rectangleperi(2,3);
		areaperimeter.circlearea(5);
		areaperimeter.circleperimeter(3);
	}
}
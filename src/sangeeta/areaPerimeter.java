//WAP to find the area and perimeter of Rectangle and Circle.
//Note: One method to find area and another for Perimeter.
//Hint: Area of Rectangle = Length * Width
// Perimeter f Rectangle = 2*Lenth + 2*Width
//Area of Circle = Pi*r*r, r is radius
//Perimeter of Circle = 2*Pi*r, where Pi = 3.116
package sangeeta;
class areaPerimeter{
	
	void area(int L, int W, double r){
		double area_rectangle = L*W;
		double area_circle = (double)(3.14*r*r);
		System.out.println(" Area of Rectangle is "+area_rectangle);
		System.out.println(" Area of Circle is "+area_circle);
	}
	
	void perimeter(int L, int W, double r){
		double perimeter_rectangle = 2*L+2*W;
		double perimeter_circle = (double)(2*3.14*r);
		System.out.println(" Perimeter of Rectangle is "+perimeter_rectangle);
		System.out.println(" Perimeter of Circle is "+perimeter_circle);
	}
	
	public static void main(String[] a){
		areaPerimeter areaPerimeter = new areaPerimeter();
		areaPerimeter.area(2,3,4);
		areaPerimeter.perimeter(2,3,4);
	}
	
}























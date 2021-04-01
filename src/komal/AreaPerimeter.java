//WAP to find the area and perimeter of Rectangle & Circle. 
//NOTE : one method to calculate area and another for perimeter.
	//HINT : 
	//Rectangle area = length * width
	//Rectangle perimeter = 2*Length + 2*Width 
	//Circle area = pi*r*r, where r is radius
	//Circle perimeter = 2*pi*r , where pi = 3.1416
package komal;
class AreaPerimeter{
	int Length,Width;
	double pi = 3.1416;
				
	void Perimeter(int Length,int Width,double r){
	double C1 = (2*pi*r);
	int R1 = 2*Length + 2*Width;
		System.out.println("Circle perimeter is " +C1);
		System.out.println("Rectangle perimeter is " +R1);
	}
		
	void Area(int Length,int Width,double r){
	double C2 = (pi*r*r);
	int R2 = Length*Width;
		System.out.println("Circle area is " + C2);
		System.out.println("Rectangle area is " + R2);
	}
	public static void main(String[] args){
		AreaPerimeter areaperimeter_1 = new AreaPerimeter();
		areaperimeter_1.Area(3,4,2);
		areaperimeter_1.Perimeter(4,2,1);
	}
}
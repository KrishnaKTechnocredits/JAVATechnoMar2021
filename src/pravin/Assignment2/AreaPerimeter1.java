/*Assignment no 2
 WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
 Rectangle perimeter = 2*Length + 2*Width 
 Circle area = pi*r*r, where r is radius
Circle perimeter = 2*pi*r , where pi = 3.1416*/


package pravin.Assignment2;  	  
class AreaPerimeter1 {
	void area (int Num1,int Num2,int Num3){
		int  length = Num1;
		int  width = Num2;
		int  r = Num3;
		float pi = 3.14f;
		int rectarea  = length * width;
		float circlearea  = pi * r * r;
		System.out.println("Area of rectangular  is " +rectarea);
		System.out.println("Area of Circle  is " +circlearea);
	}
	void perimeter (int Num1,int Num2,int Num3){
		int  length = Num1;
		int  width = Num2;
		int  r = Num3;
		float pi = 3.14f;
		int rectperimeter  = 2 * length + 2* width;
		float circlerectperimeter  = 2 * pi * r;
		System.out.println("Perimeter of rectangular  is " +rectperimeter);
		System.out.println("Perimeter of Circle  is " +circlerectperimeter);
	}

	public static void main(String[] args){
		AreaPerimeter1 areaperimeter = new AreaPerimeter1();
		areaperimeter.area(6,5,7);
		areaperimeter.perimeter(5,6,7);
	}

}

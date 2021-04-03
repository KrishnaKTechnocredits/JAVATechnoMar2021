package prachi.Assignment_2;

//Assignment_2_Program_2
//2. WAP to find the area and perimeter of Rectangle & Circle. 
//NOTE : one method to calculate area and another for perimeter.
//HINT : Rectangle area = length * width
//Rectangle perimeter = 2*Length + 2*Width 
//	   Circle area = pi*r*r, where r is radius
//	   Circle perimeter = 2*pi*r , where pi = 3.1416

class AreaParameterOfCircle{
	double x = 2;
	double length = 5;
	double width = 5;
	double pi = 3.1416;
	double radius = 4;
	
	void area1(double num1, double num2){
		double area1 = length * width;
		System.out.println("Area of Rectangle is: "+area1);
	}
	
	void area2(double num1, double num2, double num3){
		double area2 = pi*radius*radius;
		System.out.println("Area of Circle is: "+area2);	
    }
	
	void perimeter1(double num1, double num2, double num3){
		double perimeter1 = x*pi*radius;
		System.out.println("Perimeter of Circle is "+perimeter1);
		
	}
	
	void perimeter2(double num1, double num2, double num3, double num4){
		double perimeter2 = 2*length+2*width;
		System.out.println("Perimeter of Rectangle is "+perimeter2);
	}

    public static void main(String[] args){
	    AreaParameterOfCircle areaparameterofcircle = new AreaParameterOfCircle();
		areaparameterofcircle.area1(5, 5);
		areaparameterofcircle.area2(3.1416, 4, 4);
		areaparameterofcircle.perimeter1(2, 3.1416, 4);
		areaparameterofcircle.perimeter2(2, 5, 2, 5);
  }	
}

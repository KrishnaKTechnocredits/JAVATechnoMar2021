package priyanka_Panat;

/*
 Assignment 2
 */
class FindAreaPerimeter{
	double pi=3.1416;
	
	void area(int length,int width,int r){
		int res=length*width;
		System.out.println("Area of rectangle is "+res);
		double res1=pi*r*r;
		System.out.println("Area of circle is "+res1);
	}
	void perimeter(int length,int width,int r){
		int result=2*length + 2 *width;
		System.out.println("Perimeter of rectangle is "+result);
		double result1=2*pi*r;
		System.out.println("Perimeter of circle is "+result1)
		;
	}
	public static void main(String[] args){
		FindAreaPerimeter r1= new FindAreaPerimeter();
		r1.area(10,10,5);
		r1.perimeter(5,5,8);
	}
}
		
		


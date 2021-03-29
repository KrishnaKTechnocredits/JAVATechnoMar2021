package priyanka_Kamble;

/**Assignment 2 : 22nd March 2021

1. WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube.

class Square{
	
	void square(int a){
		int square=a*a;
	System.out.println("Square of the Number is" +square);
	}
	
	void cube(int b){
		int Cube= b*b*b;
		System.out.println("Cube of the Number is=" +Cube);
	}
	
	public static void main(String args[]){
		Square S = new Square();
		S.square(5);
		S.cube(5);
	}
} **/

/**2. WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
	   Circle area = pi*r*r, where r is radius
	   Circle perimeter = 2*pi*r , where pi = 3.1416
class Square{
	
	void area(int length, int width){
		//float pi = 3.1416;
		int r=3;
		int rectArea = length * width;
		double CirArea = 3.1416 *r * r;
		
		System.out.println("Area of Rectangle = " +rectArea);
		System.out.println("Area of Circle = " +CirArea);
	}
	
	void Perimiter(int Length, int Width){
		///float pi = 3.1416;
		int r=4;
		int rectPerimeter = (2* Length) + (2* Width);
		double cirPerimeter = 2* 3.1416 * r;
		
		System.out.println("Perimiter of Rectangle = " +rectPerimeter);
		System.out.println("Perimiter of Circle = " +cirPerimeter);
	}
	
	public static void main(String args[]){
		Square S = new Square();
		S.area(7,3);
		S.Perimiter(10,3);
	}
} **/	   
	   

/**
3. Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate 
class Square{
	
	void simpleInterest(int P, int T, int R){
		double Interest = (P * T * R)/100;
		System.out.println("Simple interest is " +Interest);
	}
	
	public static void main(String args[]){
		Square S = new Square();
		S.simpleInterest(400, 3, 11);
		
	}
} **/
/**
4. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Create parameterized methods if possible.**/
class Square{
	
	void temperature(int fahrenheit){
		double Celsius = (fahrenheit - 32) * 5 / 9;
	System.out.println("temperature" +Celsius);
	}
	
	public static void main(String args[]){
		Square S = new Square();
		S.temperature(200);
		
	}
}







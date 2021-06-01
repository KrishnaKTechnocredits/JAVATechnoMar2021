package rikin.assignment2;

class Calculation{
	double pi = 3.1416;
	
	void area(int l, int w, int r){           
		int rectangleArea = l * w;                    
		double circleArea = pi * r * r;           
		System.out.println("Rectangle area is " + rectangleArea);
		System.out.println("Circle area is " + circleArea);
	}
	
	void perimeter(int l, int w, int r){      
		int rectanglePerimeter = (2 * l)+ (2 * w) ;   
		double circlePerimeter = 2 * pi * r ;      
		System.out.println("Rectangle perimeter is " + rectanglePerimeter);
		System.out.println("Circle Perimeter is " + circlePerimeter);
	}
	
	public static void main (String [] args){
		Calculation calculation = new Calculation();
		calculation.area(10,20,30); 
		calculation.perimeter(5,10,15); 
	}
}	
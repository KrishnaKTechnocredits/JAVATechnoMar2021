//Assign 2- pro 2--WAP to find area and perimeter of rectangle and circle
package kajal;

class areaPeri{
double pi=3.1416;
	void rectangle(int length, int width){
	int area= length * width;
	int perimeter= 2 * length + 2 * width;
	System.out.println("Area of Rectangle is "+ area+ " and perimeter is " +perimeter);
	}
	void circle(int r){
	double area= pi * r * r;
	double perimeter= 2 * pi * r;
	System.out.println("Area and of Circle is " +area+ " and perimeter is " +perimeter);
	}
	public static void main(String [] args){
		areaPeri areaperi1 = new areaPeri();
		areaperi1.rectangle(2,2);
		areaperi1.circle(4);
	}
	}
	
		
	

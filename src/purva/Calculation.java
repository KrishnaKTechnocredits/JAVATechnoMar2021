/* 
 * Assignment 2 area and perimeter of rectangle and circle
 */
package purva;

class Calculation{
	
    void rectangle(int len, int width){
		int area= len * width;
		int perimeter= 2 * len + 2 *width;
		System.out.println("Area of rectangle is " +area);
		System.out.println("Perimeter of rectangle is " +perimeter);
	}
	
	void circle(int r){
		double pi = 3.1416;
		int area= 2 * r* r;
		double perimeter = 2 * pi * r;
		System.out.println("Area of circle is "+area);
		System.out.println("Perimeter of circle is "+perimeter);
	}
	public static void main(String[] args){
		Calculation calculation = new Calculation();
		calculation.rectangle(5,6);
		calculation.circle(3);
	}
	
}
		
   
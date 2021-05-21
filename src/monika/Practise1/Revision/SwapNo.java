package monika.Practise1.Revision;

/*Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.*/

public class SwapNo {
	void swapFunction(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a: "+a+" and value of b: "+b);
	}	
	
	void swapWithoutUsingTemp() {
		System.out.println("Before swapping");  
		  int x = 10;  
		  int y = 20;  
		  System.out.println("value of x:" + x);  
		  System.out.println("value of y:" + y);  
		  System.out.println("After swapping");  
		  x = x + y;  
		  y = x - y;  
		  x = x - y;  
		  System.out.println("value of x:" + x);  
		  System.out.println("value of y:" + y);  
		 }  
	
	public static void main(String[] args) {
		SwapNo obj = new SwapNo();
		obj.swapFunction(10, 20);
		
		obj.swapWithoutUsingTemp();
	}
}
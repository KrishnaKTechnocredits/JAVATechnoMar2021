package ami.Assignment_31;
/*Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
*/
class SwapTwoNums {

	void swapNumbers(int x , int y){
		System.out.println("**** with Temp ****");
		System.out.println("Old values of X :"+x+" and Y: "+y);
		int temp = 0;
		temp = y;
		y = x;
		x= temp;
		System.out.println("New values of X :"+x+" and Y: "+y);
	}
	
	void swapWithousUsingTemp(int x , int y) {
		System.out.println("**** without Temp ****");
		System.out.println("Old values of X :"+x+" and Y: "+y);
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("New values of X :"+x+" and Y: "+y);		
	}

public static void main(String[] args){
	SwapTwoNums swapTwoNumbers = new SwapTwoNums();
	swapTwoNumbers.swapNumbers(5,9);
	swapTwoNumbers.swapWithousUsingTemp(5, 9);
	}
}
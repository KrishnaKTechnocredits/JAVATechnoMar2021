/*
 * Assignment - 31 : 4th May'2021

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.

 */
package rupali.assignment31;

public class SwappingwithoutTemp {
		void swapnumberswithouttemp(int x,int y) {
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("After swapping value of x="+x+" and y="+y);
		}
		public static void main(String[] args) {
			int x=10,y=20;
			System.out.println("Enter the value for x and y "+x+" "+y);
			new SwappingwithoutTemp().swapnumberswithouttemp(x,y);
		}


}

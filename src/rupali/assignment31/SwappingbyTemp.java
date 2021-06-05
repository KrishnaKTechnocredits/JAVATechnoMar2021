/*
 *  Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

 */
package rupali.assignment31;

public class SwappingbyTemp {
	void swapnumbers(int x,int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping value of x="+x+" and y="+y);
	}
	public static void main(String[] args) {
		int x=10,y=20;
		System.out.println("Enter the value for x and y "+x+" "+y);
		new SwappingbyTemp().swapnumbers(x,y);
	}

}

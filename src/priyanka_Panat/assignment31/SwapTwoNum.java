/*
 Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
 */
package priyanka_Panat.assignment31;

public class SwapTwoNum {
	
	void withTemp(int x,int y) {
		System.out.println("Swapping of Two Numbers with using Temporary Variable");
		System.out.println("Numbers before swapping : x = " +x + " , " + "y = " + y );
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("Numbers after swapping  : x= " + x +  " , " + " y = " + y );
	}
	
	void withoutTemp(int x,int y) {
		System.out.println("Swapping of Two Numbers without using Temporary Variable");
		System.out.println("Numbers before swapping : x = " + x +  " , " + " y = " + y );
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Numbers after swapping : x= " + x +  " , " + " y = " + y );
	}
	
	public static void main(String[] args) {
		SwapTwoNum swapTwoNum=new SwapTwoNum();
		swapTwoNum.withTemp(10, 20);
		swapTwoNum.withoutTemp(10, 20);
		
	}
}
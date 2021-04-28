//WAP of Assignment 6 using While loop.

package sandesh.Assignment_8;

import java.util.Scanner;

public class NumberDivisibilityWhileLoop {

	void getEvenNumbers(int startPoint, int endPoint){
		System.out.println("Even numbers within range " + startPoint + " and " + endPoint + " are -: ");
		int index = startPoint;
		while(index <= endPoint) {
			if(index % 2 == 0)
				System.out.print(index + ", ");
			index++;
		}
	}
	
	void getDivisibleByFiveNumbers(int startPoint, int endPoint){
		System.out.println("");
		System.out.println("Numbers divisible by 5 within range " + startPoint + " and " + endPoint + " are -: ");
		int index = startPoint;
		while(index <= endPoint) {
			if(index % 5 == 0)
				System.out.print(index + ", ");
			index++;
		}
	}
	
	void getDivisibleByThreeAndFiveNumbers(int startPoint, int endPoint) {
		System.out.println("");
		System.out.println("Numbers divisible by 3 and 5 within range " + startPoint + " and " + endPoint + " are -: ");
		int index = startPoint;
		while(index <= endPoint) {
			if(index % 3 == 0 && index % 5 == 0)
				System.out.print(index + ", ");
			index++;
		}
	}
	
	void getDivisibleBySevenOrThirteenNumbers(int startPoint, int endPoint) {
		System.out.println("");
		System.out.println("Numbers divisible by 7 or 13 within range " + startPoint + " and " + endPoint + " are -: ");
		int index = startPoint;
		while(index <= endPoint) {
			if(index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			if(index % 13 == 0)
				System.out.println(index + " is divisible by 13");
			index++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter range within which you want to find number series");
		System.out.println("Enter starting point -: ");
		int startNum = sc1.nextInt();
		System.out.println("Enter ending point -: ");
		int endNum = sc1.nextInt();
		new NumberDivisibilityWhileLoop().getEvenNumbers(startNum, endNum);
		new NumberDivisibilityWhileLoop().getDivisibleByFiveNumbers(startNum, endNum);
		new NumberDivisibilityWhileLoop().getDivisibleByThreeAndFiveNumbers(startNum, endNum);
		new NumberDivisibilityWhileLoop().getDivisibleBySevenOrThirteenNumbers(startNum, endNum);
		sc1.close();
	}
}

//Program 1:  From given numbers, count the odd and even numbers.
//input : 10,23,26,27,88,87,65 
//output : even -> 3
//      odd ->  array.length - evenCount

package prashant;

import java.util.Scanner;

public class ArrOddEvenCnt {

	void dispOddEvencnt(int[] num1) {
		int oddCnt = 0, evenCnt = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] % 2 == 0)
				evenCnt++;
			else
				oddCnt++;
		}
		System.out.println("Odd numbers Count  :" + oddCnt);
		System.out.println("Even Numbers Count :" + evenCnt);
	}

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter Size of  Array:");
		int temp = num.nextInt();
		int[] num1 = new int[temp];
		System.out.println("Enter" + " " + temp + " " + "Integers Numbers:");

		for (int i = 0; i < temp; i++) {
			num1[i] = num.nextInt();
		}
		new ArrOddEvenCnt().dispOddEvencnt(num1);
		num.close();
	}
}

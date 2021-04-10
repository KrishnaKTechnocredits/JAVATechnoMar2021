//From given array return min number.
//input : 22,35,65,88,11,23,45
//output : 11

package prashant;

import java.util.Scanner;

public class ArrReturnMin {

	void dispMin(int[] num1) {
		int min = num1[0];
		for (int i = 0; i < num1.length; i++ ) {
			if (num1[i] < min) {
				min = num1[i];
			}
		}
		System.out.println("Minimum number from array :" + min);
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
		new ArrReturnMin().dispMin(num1);
		num.close();
	}
}

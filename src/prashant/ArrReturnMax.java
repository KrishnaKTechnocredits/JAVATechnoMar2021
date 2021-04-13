//From given array return max number.
//input : 22,35,65,88,11,23,45
//output : 88

package prashant;

import java.util.Scanner;

public class ArrReturnMax {

	void dispMax(int[] num1) {
		int max = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] > max)
				max = num1[i];
		}
		System.out.println("Maximum number from array :" + max);
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
		new ArrReturnMax().dispMax(num1);
		num.close();
	}

}

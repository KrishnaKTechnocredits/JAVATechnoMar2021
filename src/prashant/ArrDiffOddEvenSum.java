//return a difference between sum of even number and odd numbers.	
//	From given numbers, count the odd and even numbers.
//	input : 10,23,26,27,88,87,65 
//    output : evenSum - oddSum
//	
//	int getDifference(int[] input)
//	
package prashant;

import java.util.Scanner;

public class ArrDiffOddEvenSum {

	int getDiffernce(int[] num1) {

		int sumeven = 0, sumodd = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] % 2 == 0) {
				sumeven = sumeven + num1[i];
			} else
				sumodd = sumodd + num1[i];
		}
		if (sumeven > sumodd)
			return sumeven - sumodd;
		else
			return sumodd - sumeven;
	}

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter Size of  Array:");
		int temp = num.nextInt();
		// Memory allocation for array num1
		int[] num1 = new int[temp];

		System.out.println("Enter" + " " + temp + " " + "Integers Numbers:");
		for (int i = 0; i < temp; i++) {
			num1[i] = num.nextInt();
		}
		int diff = new ArrDiffOddEvenSum().getDiffernce(num1);
		System.out.println("Difference between sum of even number and odd numbers:" + diff);
		num.close();
	}

}

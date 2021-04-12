/*Assignment - 17
return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}

*/
package neha_Rathi.assignment17;

import java.util.Scanner;

public class SumOddEven {

	int getDifference(int[] num) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0)
				sumEven = sumEven + num[index];
			else
				sumOdd += num[index];
		}
		if (sumEven > sumOdd)
			return (sumEven - sumOdd);
		else
			return (sumOdd - sumEven);
	}

	public static void main(String[] args) {
		SumOddEven sumOddEven = new SumOddEven();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nos you want to enter");
		int size = sc.nextInt();
		int[] inputNum = new int[size];
		for (int index = 0; index < inputNum.length; index++) {
			System.out.println("Enter no " + index);
			inputNum[index] = sc.nextInt();
		}
		System.out.println("Diffrerance is: " + sumOddEven.getDifference(inputNum));
	}
}

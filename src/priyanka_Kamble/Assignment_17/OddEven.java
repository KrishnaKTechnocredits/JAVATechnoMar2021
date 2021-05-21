package priyanka_Kamble.Assignment_17;
/*Assignment - 17 : 10th April'2021
Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> input.length - evenCount*/

/*Program 2: return a difference between sum of even number and odd numbers.
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum
int getDifference(int[] input){
}*/

public class OddEven {
	int evenNumber = 0, OddNumber = 0, evenindex, evenSum = 0, oddindex, oddNumber, oddSum = 0;

	void evenNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				evenindex = input[index];
				evenSum = evenSum + evenindex;
				evenNumber++;
			}
		}
		System.out.println("Total Even Numbers are - " + evenNumber);
		System.out.println("Sum Of all Even Numbers - " + evenSum);
	}

	void oddNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 != 0) {
				oddindex = input[index];
				oddSum = oddSum + oddindex;
				oddNumber++;
			}
		}
		System.out.println("Total odd Numbers are - " + oddNumber);
		System.out.println("oddSum Of all odd Numbers - " + oddSum);
	}

	void difference(int[] input) {
		new OddEven().evenNumber(input);
		new OddEven().oddNumber(input);
		if (evenSum > oddSum)
			System.out.println("Difference btwn Even Number & Odd Number - " + (evenSum - oddSum));
		// return (evenSum-oddSum);
		if (evenSum < oddSum)
			System.out.println("Difference btwn Odd Number & Even Number - " + (oddSum - evenSum));
		// return (oddSum-evenSum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 26, 27, 88, 87, 65 };
		// System.out.println("------ Even Number Operation ------");
		// new OddEven().evenNumber(input);
		// System.out.println("\n");
		// System.out.println("------ Odd Number Operation ------");
		// new OddEven().oddNumber(input);
		// System.out.println("\n");
		new OddEven().difference(input);
	}
}

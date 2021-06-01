package kangan.assignments.assignment_17;

public class ArrayEvenOddCount_1 {
	
	void oddEvenCount(int[] input) {
		int evenSize = 0;
		int oddSize = 0;
		int num;

		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evenSize++;
			else
				oddSize++;
		}
		System.out.println("Even number count : " + evenSize);
		System.out.println("Odd number count : " + oddSize);

		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				num = input[index];
				System.out.println(num + " : Even number");
			} else {
				num = input[index];
				System.out.println(num + " : Odd number");
			}
		}
	}

	public static void main(String[] args) {
		int[] number = { 10, 23, 26, 27, 88, 87, 65 };
		ArrayEvenOddCount_1 array1 = new ArrayEvenOddCount_1();
		array1.oddEvenCount(number);

	}
}

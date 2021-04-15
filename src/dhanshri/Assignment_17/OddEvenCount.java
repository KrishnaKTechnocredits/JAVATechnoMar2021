package dhanshri.Assignment_17;

public class OddEvenCount {

	void evenOddCount(int[] input) {
		int evencount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evencount++;
		}
		int oddcount = input.length - evencount;
		System.out.println("Even number count: " + evencount);
		System.out.println("Odd number count: " + oddcount);
	}

	public static void main(String[] args) {

		int[] num = { 10, 23, 26, 27, 88, 87, 65 };
		new OddEvenCount().evenOddCount(num);
	}
}

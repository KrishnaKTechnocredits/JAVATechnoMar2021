package amrutaM.arrayAssignments;

/* Array Program 2: return a difference between sum of even number and odd numbers.
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum
*/

public class ReturnDifferenceEvenOdd {

	int getDifference(int[] input) {
		int evenCount = 0;
		int oddCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				evenCount = evenCount + 1;
			} else {
				oddCount = input.length - evenCount;
			}
		}

		return oddCount -evenCount ;
	}

	public static void main(String[] args) {
		ReturnDifferenceEvenOdd returnDiffEvenOdd = new ReturnDifferenceEvenOdd();
		int[] numbers = { 10, 23, 26, 27, 88, 87, 65 };
		int difference = returnDiffEvenOdd.getDifference(numbers);
		System.out.println("Difference between even and odd numbers is --> " + difference);
	}
}

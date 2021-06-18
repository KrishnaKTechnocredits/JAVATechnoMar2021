package amrutaM.arrayAssignments;

/*Array Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount
*/
public class CountEvenOdd {

	void evenOddNumber(int[] numbers) {
		int evenCount = 0;
		for (int index = 0; index < numbers.length; index++) {
			
			if (numbers[index] % 2 == 0) {
				evenCount = evenCount + 1;
			}
		}
		System.out.println("Total Even numbers are --> "+evenCount);
		System.out.println("Total Odd numbers are --> "+(numbers.length-evenCount));

	}

	public static void main(String[] args) {
		int[] numbers = { 10, 23, 26, 27, 88, 87, 65 };
		CountEvenOdd count = new CountEvenOdd();
		count.evenOddNumber(numbers);
		// Character.isUpperCase(ch)
	}
}

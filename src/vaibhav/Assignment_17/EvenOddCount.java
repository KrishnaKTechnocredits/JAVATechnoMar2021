package vaibhav.Assignment_17;

/*Program 1: From given numbers, count the odd and even numbers.

input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount
*/

public class EvenOddCount {

	int[] number = new int[8];

	int evenCount;

	void toFindEvenOddCount(int[] number) {
		for (int index = 0; index < number.length; index++) {
			if (number[index] % 2 == 0)
				evenCount++;
		}
		System.out.println("Count for Even Number form given set of numbers is : " + evenCount);
		System.out.println("Count for Odd Number form given set of numbers is  : " + (number.length - evenCount));

	}

	public static void main(String[] args) {
		int[] number = { 15, 48, 16, 1, 2, 6, 48, 64 };

		EvenOddCount evenOddCount = new EvenOddCount();
		evenOddCount.toFindEvenOddCount(number);
	}
}

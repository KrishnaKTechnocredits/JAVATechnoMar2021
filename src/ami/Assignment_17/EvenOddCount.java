/*
 Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
*/

package ami.Assignment_17;

public class EvenOddCount {
	void toFindEvenOddCount(int[] arr) {
		int even = 0, odd = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				even++;
			} else
				odd++;
		}
		System.out.println("Even Number Count : " + even);
		System.out.println("Odd Number Count : " + odd);
	}

	public static void main(String[] a) {
		int[] arr = { 10, 23, 26, 27, 88, 87, 65 };

		EvenOddCount evenOddCount = new EvenOddCount();
		evenOddCount.toFindEvenOddCount(arr);
	}

}

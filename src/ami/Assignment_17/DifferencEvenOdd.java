/*
 return a difference between sum of even number and odd numbers.
 */

package ami.Assignment_17;

public class DifferencEvenOdd {

	int isDiffEvenOdd(int[] arr) {
		int even = 0, odd = 0, num = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				even = even + arr[index];
			} else {
				odd = odd + arr[index];

			}
			num = odd - even;
		}
		return num;
	}

	public static void main(String[] arr) {
		DifferencEvenOdd differencEvenOdd = new DifferencEvenOdd();
		int[] arr1 = { 10, 23, 26, 27, 88, 87, 65 };
		int number = differencEvenOdd.isDiffEvenOdd(arr1);
		System.out.println("Difference between Even and Odd numer : " + number);
	}

}

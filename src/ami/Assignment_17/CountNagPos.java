/*
 From given numbers, count the negative and positive numbers
 */

package ami.Assignment_17;

public class CountNagPos {

	void isNagPositivecount(int[] arr) {
		int positivecount = 0, nagativeCount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				positivecount++;
			} else {
				nagativeCount++;
			}
		}
		System.out.println("Positive number count : " + positivecount);
		System.out.println("Nagative number Count : " + nagativeCount);
	}

	public static void main(String[] a) {
		CountNagPos c1 = new CountNagPos();
		int[] arr1 = { 10, 23, 26, -27, -88, 87, -65 };
		c1.isNagPositivecount(arr1);
	}

}

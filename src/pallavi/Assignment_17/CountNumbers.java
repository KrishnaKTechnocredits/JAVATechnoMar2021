package pallavi.Assignment_17;

/*From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
*/

public class CountNumbers {

	void getCountOfNegativeAndPositiveNum(int[] array) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > 0)
				count++;

		}
		System.out.println("Count of positive numbers are : " + count);
		int countN = array.length - count;
		System.out.println("Count of negative numbers are :" + countN);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 23, 26, -27, -88, 87, -65 };
		new CountNumbers().getCountOfNegativeAndPositiveNum(arr);

	}
}

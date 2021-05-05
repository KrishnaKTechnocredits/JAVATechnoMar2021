/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
*/

package shashank.array_17_18;

public class ArrayCountOddEven {

	public int countOddEven(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public void displayOddEven(int cnt, int[] arr) {
		System.out.println("Count of even number is " + cnt);
		System.out.println("count of odd number is " + (arr.length - cnt));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 23, 26, 27, 88, 87, 65, 77, 89, 20 };
		ArrayCountOddEven countOddEven = new ArrayCountOddEven();
		int cnt = countOddEven.countOddEven(arr);
		countOddEven.displayOddEven(cnt, arr);
	}

}

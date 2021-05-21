/* return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}
*/

package shashank.array_17_18;

public class ArrayDiffSumEvenOdd {

	public int diffSumEvenOdd(int[] arr) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0)
				evenSum += arr[index];
			else
				oddSum += arr[index];
		}
		return evenSum - oddSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 9, 26, 27, 88, 87, 80, 77, 99, 102 };
		ArrayDiffSumEvenOdd diffSumEvenOdd = new ArrayDiffSumEvenOdd();
		int diffSumOddEven = diffSumEvenOdd.diffSumEvenOdd(arr);
		System.out.println("Difference between sum of even number and odd numbers " + diffSumOddEven);
	}

}

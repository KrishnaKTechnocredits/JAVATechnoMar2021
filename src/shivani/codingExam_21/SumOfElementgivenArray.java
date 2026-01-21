package shivani.codingExam_21;

/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0*/

public class SumOfElementgivenArray {

	void sumofElementExceptsixToNine(int[] arr) {
		int sum = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			if (num == 6 || flag) {
				if (num == 9) {
					flag = false;
					continue;
				}
				flag = true;
				continue;
			}

			else if (num != 6 || num != 9) {
				sum = sum + num;

			}

		}
		System.out.println("output " + sum);
	}

	public static void main(String[] args) {
		SumOfElementgivenArray sumOfElementgivenArray = new SumOfElementgivenArray();

		int arr1[] = { 4, 5, 6, 12, 2, 9, 1, 3 };

		sumOfElementgivenArray.sumofElementExceptsixToNine(arr1);

	}

}

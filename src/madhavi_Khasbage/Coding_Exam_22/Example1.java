package madhavi_Khasbage.Coding_Exam_22;

/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0*/

public class Example1 {

	static int getAddition(int[] arr) {
		int sum = 0;
		boolean exclude = false;
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (num == 6) {
				exclude = true;
			}
			if (!exclude) {
				sum += arr[index];
			}
			if (num == 9) {
				exclude = false;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr = {6,1,4,5,9};
		System.out.println(Example1.getAddition(arr));
	}

}

package pallavi.CodingExam22;

/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]
output 1: 9

input 2 : [4,5,6,12,2,9,1,3]
output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]
output 3: 16

input 4 : [6,1,4,5,9]
output 4 : 0
*/
public class CodingExam22 {
	static int sumOfArray(int arr[], int num1, int num2) {
		int sum = 0;
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != num1 && flag == true) {
				sum += arr[index];
			} else if (arr[index] == num1) {
				flag = false;
			} else if (arr[index] == num2) {
				flag = true;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int input1[] = { 1, 3, 5 };
		int input2[] = { 4, 5, 6, 12, 2, 9, 1, 3 };
		int input3[] = { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 };
		int input4[] = { 6, 1, 4, 5, 9 };
		int a = 6;
		int b = 9;
		int output1 = CodingExam22.sumOfArray(input1, a, b);
		int output2 = CodingExam22.sumOfArray(input2, a, b);
		int output3 = CodingExam22.sumOfArray(input3, a, b);
		int output4 = CodingExam22.sumOfArray(input4, a, b);

		System.out.println("Result of input1 :" + output1);
		System.out.println("Result of input2 :" + output2);
		System.out.println("Result of input3 :" + output3);
		System.out.println("Result of input4 :" + output4);

	}

}

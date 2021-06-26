package madhavi_Raut.CodingExam.Exam_22;

/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.
input 1: [1,3,5]
output 1: 9
input 2 : [4,5,6,12,2,9,1,3]
output 2: 13
input 3 : [2,1,6,9,11,6,19,12,9,2]
output 3: 16
input 4 : [6,1,4,5,9]
output 4 : 0*/
public class FindSumOfArray {

	int getArraySum(int[] arr) {

		int sum = 0;
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] != 6) {
				sum += arr[index];
			} else if (arr[index] == 6) {
				while (arr[index] != 9) {
					if (index <= arr.length - 2)
						index++;
					else
						break;

				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		FindSumOfArray findSumOfArray = new FindSumOfArray();
		System.out.print("For [1,3,5]: ");
		System.out.println(findSumOfArray.getArraySum(new int[] { 1, 3, 5 }));
		System.out.print("For [4, 5, 6, 12, 2, 9, 1, 3]: ");
		System.out.println(findSumOfArray.getArraySum(new int[] { 4, 5, 6, 12, 2, 9, 1, 3 }));
		System.out.print("For [2, 1, 6, 9, 11, 6, 19, 12, 9, 2 ]: ");
		System.out.println(findSumOfArray.getArraySum(new int[] { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 }));
		System.out.print("For [6, 1, 4, 5, 9 ]: ");
		System.out.println(findSumOfArray.getArraySum(new int[] { 6, 1, 4, 5, 9 }));
	}
}

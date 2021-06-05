/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an inputay.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package ami.Coding_Exam_1;

public class ReturnDiffBtwnMaxMin {

	int findAge(int[] input) {
		int maxAge = input[0], minAge = input[0];
		for (int index = 1; index < input.length; index++) {
			if (input[index] > maxAge) {
				maxAge = input[index];
				if (input[index] < minAge)
					minAge = input[index];
			}
		}
		return maxAge - minAge;
	}

	public static void main(String[] args) {
		ReturnDiffBtwnMaxMin returnDiffBtwnMaxMin = new ReturnDiffBtwnMaxMin();
		int[] input = { 7, 12, 56, 62, 25 };
		System.out.println("output : " + returnDiffBtwnMaxMin.findAge(input));
	}
}

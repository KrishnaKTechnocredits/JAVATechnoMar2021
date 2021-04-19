/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

package aparna.codingExam1;

public class DifferenceOfAge {

	int maxMinAgeDiff(int[] inputAge) {
		int maximumvalue = inputAge[0];
		int minimumvalue = inputAge[0];

		for (int index = 0; index < inputAge.length; index++) {
			if (inputAge[index] > maximumvalue) {
				maximumvalue = inputAge[index];
			} else if (inputAge[index] < minimumvalue) {
				maximumvalue = inputAge[index];
			}
		}
		return (maximumvalue - minimumvalue);
	}

	public static void main(String[] args) {
		DifferenceOfAge differenceOfAge = new DifferenceOfAge();
		int[] inputAgeArray = { 7, 12, 56, 62, 25 };
		int result = differenceOfAge.maxMinAgeDiff(inputAgeArray);
		System.out.println("Age Difference Between Elder and Younger is: " + result);
	}

}

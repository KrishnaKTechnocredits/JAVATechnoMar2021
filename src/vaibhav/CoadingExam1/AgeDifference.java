/*Coding Exam - 1 : 18th April 2021
 
Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
*/

package vaibhav.CoadingExam1;

public class AgeDifference {

	int ageDiff;
	int maxAge;
	int minAge;

	int getMaxAgeDiff(int arr[]) {
		maxAge = arr[0];
		minAge = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxAge < arr[index])
				maxAge = arr[index];
			if (minAge > arr[index])
				maxAge = arr[index];
		}
		ageDiff = maxAge - minAge;
		return ageDiff;
	}

	public static void main(String[] args) {
		int[] age = { 7, 12, 56, 62, 25 };

		AgeDifference ageDifference = new AgeDifference();

		System.out.println("Difference between a Younger and an Elder member of the family is : "
				+ ageDifference.getMaxAgeDiff(age));
	}
}

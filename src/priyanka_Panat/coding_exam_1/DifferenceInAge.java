/*
 Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

package priyanka_Panat.coding_exam_1;

public class DifferenceInAge {

	int getAgeDifference(int[] age) {
		int maxAge = age[0];
		int minAge = age[0];
		for (int index = 0; index < age.length; index++) {
			if (age[index] > maxAge) {
				maxAge = age[index];
			} else if (age[index] < minAge) {
				minAge = age[index];
			}
		}
		return (maxAge - minAge);

	}

	public static void main(String[] args) {
		DifferenceInAge differenceInAge = new DifferenceInAge();
		int[] input = { 7, 12, 56, 62, 25 };
		System.out.println("Diffrenec is " + differenceInAge.getAgeDifference(input));

	}

}

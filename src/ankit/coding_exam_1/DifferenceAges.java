/*
 Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

package ankit.coding_exam_1;

public class DifferenceAges {

	int getoldestMemberAge(int[] age) {
		int maxAge = age[0];
		for(int index = 1; index <age.length;index++) {
			if(age[index] > maxAge ) {
				maxAge = age[index];
			}
		} return  maxAge;
	}

	int getYoungestMemberAge(int[] age) {
		int minAge = age[0];
		for(int index = 1; index <age.length;index++) {
			if(age[index] < minAge ) {
				minAge = age[index];
			}
		}return minAge;	
	}

	public static void main(String[] args) {
		int[] age = {7, 12, 56, 65, 25};
		DifferenceAges differenceAges = new DifferenceAges();
		int maxAge = differenceAges.getoldestMemberAge(age);
		int minAge = differenceAges.getYoungestMemberAge(age);
		System.out.println("Difference between Oldest and Youngest :" +(maxAge - minAge));
	}
}

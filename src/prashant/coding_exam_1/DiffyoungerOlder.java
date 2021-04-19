/*provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package prashant.coding_exam_1;

public class DiffyoungerOlder {
	int differnce = 0;

	int diffcal(int[] age) {
		int max = age[0];
		int min = age[0];
		for (int i = 0; i < age.length; i++) {
			if (min > age[i]) {
				min = age[i];
			} else if (max < age[i]) {
				max = age[i];
			}
		}
		return differnce = max - min;
	}

	public static void main(String[] arg) {
		DiffyoungerOlder diff = new DiffyoungerOlder();
		int[] age = { 7, 12, 56, 62, 25 };
		int d = diff.diffcal(age);
		System.out.println("difference of younger and older family member is " + d);
	}
}
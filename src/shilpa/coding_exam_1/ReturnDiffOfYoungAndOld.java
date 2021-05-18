/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. 
Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package shilpa.coding_exam_1;

public class ReturnDiffOfYoungAndOld {

	int getAgeDiff(int[] age) {
		int min = age[0];
		int max = age[0];
		for (int index1 = 0; index1 < age.length; index1++) {
			if (age[index1] < min) {
				min = age[index1];
			}
			if (age[index1] > max) {
				max = age[index1];
			}
		}
		System.out.println("Age Difference=" + (max - min));
		return max - min;
	}

	public static void main(String[] args) {
		ReturnDiffOfYoungAndOld returnDiffOfYoungAndOld = new ReturnDiffOfYoungAndOld();
		int[] input = { 7, 12, 56, 62, 25 };

		returnDiffOfYoungAndOld.getAgeDiff(input);
	}
}

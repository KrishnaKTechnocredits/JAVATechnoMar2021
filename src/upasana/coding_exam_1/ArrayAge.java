/*
Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

package upasana.coding_exam_1;

public class ArrayAge {
	
	int minAge(int[] age) {
		int min=age[0];
		for (int index = 0; index <age.length; index++) {
			
			if (min > age[index])
				min = age[index];
		}
		return min;
	}

	int maxAge(int[] age) {
		int max=age[0];
		for (int index = 0; index <age.length; index++) {
		
			if (max < age[index])
				max = age[index];
		}
		return max;
	}

	void agediff(int[] age) {
		int diff=0;
		int max1 = maxAge(age);
		int min1 = minAge(age);
		diff = max1 - min1;

		System.out.println("Age difference is : " + diff);
	}

	public static void main(String[] args) {
		int[] age = new int [] {7, 12, 56, 62, 25};
		new ArrayAge().agediff(age);
		
	}
}

/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package rahul_Hiremath.exam_1;

public class Exam1_Prog2 {

	void findMaxMin(int[] array) {
		int min = array[0];
		int max = array[0];
		for (int index = 0; index < array.length; index++) {
			for (int j = 1; j < array.length; j++) {
				if (min > array[j])
					min = array[j];
				if (max < array[j])
					max = array[j];
			}
		}
		differnce(max, min);
	}

	void differnce(int max, int min) {
		int difference = max - min;
		System.out.println("Difference is " + difference);
	}

	public static void main(String[] args) {

		Exam1_Prog2 exam1_Prog2 = new Exam1_Prog2();
		int[] array = { 7, 12, 56, 62, 25 };
		exam1_Prog2.findMaxMin(array);
	}
}

package pallavi.coding_exam_1;

/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7  12 56 62 25

Sample Output: 55*/

public class Difference {

	void diffOfAge(int[] a) {
		int max = a[0];
		int min = a[0];
		for (int index = 1; index < a.length; index++) {
			if (a[index] > max)
				max = a[index];
		}

		for (int index = 1; index < a.length; index++) {
			if (a[index] < min)
				min = a[index];
		}

		System.out.println("Difference between Yonger and elder is :" + (max - min));
	}

	public static void main(String[] args) {
		int[] age = { 7, 12, 56, 62, 25 };
		Difference difference = new Difference();
		difference.diffOfAge(age);

	}

}

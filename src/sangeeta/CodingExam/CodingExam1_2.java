/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam1_2 {
	static int min;
	static int max;

	void youngAge(int[] ages) {
		int min = ages[0];
		int max = ages[0];
		for (int i = 1; i < ages.length; i++) {
			if (ages[i] < min)
				min = ages[i];
			else if (ages[i] > max)
				max = ages[i];
		}
		int output = max - min;
		System.out.println("Difference of age of Younger and Elder member is " + output);
	}

	public static void main(String[] a) {
		CodingExam1_2 codingExam1_2 = new CodingExam1_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = scanner.nextInt();
		int[] ages = new int[size];
		System.out.println("Enter array of Ages");
		for (int i = 0; i < ages.length; i++) {
			ages[i] = scanner.nextInt();
		}
		codingExam1_2.youngAge(ages);
	}
}

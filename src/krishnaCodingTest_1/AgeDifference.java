package krishnaCodingTest_1;

import java.util.Scanner;

/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25
Sample Output: 55
*/
public class AgeDifference {
	int younderElderAgeDiff(int[] age) {
		int maxage = age[0];
		for (int index = 1; index < age.length; index++) {
			if (maxage < age[index]) {
				maxage = age[index];
			}
		}
		System.out.println("max age " + maxage);
		int minage = age[0];
		for (int index = 1; index < age.length; index++) {
			if (minage > age[index]) {
				minage = age[index];
			}
		}
		System.out.println("min age " + minage);
		int differenceAge = maxage - minage;
		return differenceAge;
	}

	public static void main(String[] args) {
		AgeDifference ageDifference = new AgeDifference();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many ages you want to give :");
		int count = scanner.nextInt();
		int[] age = new int[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the age :");
			age[index] = scanner.nextInt();
		}

		int differenceAge = ageDifference.younderElderAgeDiff(age);
		System.out.println("Difference between younger and older age :" + differenceAge);
	}

}

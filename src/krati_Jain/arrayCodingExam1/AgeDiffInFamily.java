/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package krati_Jain.arrayCodingExam1;

import java.util.Scanner;

public class AgeDiffInFamily {

	public static void main(String[] args) {
		AgeDiffInFamily ageDiffInFamily = new AgeDiffInFamily();
		ageDiffInFamily.setData();

	}

	void setData() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Provide the length of the array you want to create? (should be a whole number) : ");
		int arrLeng = scan.nextInt();
		int[] inputArr = new int[arrLeng];
		System.out.println("Enter the age of family members one by one");

		for (int index = 0; index < arrLeng; index++) {
			inputArr[index] = scan.nextInt();
		}

		validatingMinMaxAge(inputArr);

	}

	void validatingMinMaxAge(int[] inputArr) {
		int minAge = inputArr[0];
		int maxAge = inputArr[0];
		int index = 0;
		int count = 0;
		for (index = 1; index < inputArr.length; index++) {
			if ((inputArr[index]) < minAge)
				minAge = inputArr[index];

			else
				maxAge = inputArr[index];

		}

		if (minAge < maxAge)
			System.out.println(
					"Age Difference between a Younger and an elder member of the family is: " + (maxAge - minAge));

		else
			System.out.println(
					"Age Difference between a Younger and an elder member of the family is: " + (minAge - maxAge));

	}

}

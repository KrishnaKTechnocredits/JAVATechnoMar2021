/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

package rashmi.CodingTest1;

public class DifferenceBetweenYoungerAndElder {

	int age[] = { 7, 12, 56, 62, 25 };

	void diffBetwnYoungerElder() {
		int maxAge = findMaxAge();
		int minAge = findMinAge();
		int diff = maxAge - minAge;
		System.out.println("The difference between younger and elder member of the family is " + diff);

	}

	int findMaxAge() {
		int maxAge = age[0];

		for (int index = 1; index < age.length; index++) {
			if (maxAge < age[index])
				maxAge = age[index];
		}
		return maxAge;
	}

	int findMinAge() {
		int minAge = age[0];

		for (int index = 1; index < age.length; index++) {
			if (minAge > age[index])
				minAge = age[index];
		}
		return minAge;
	}

	public static void main(String[] args) {
		new DifferenceBetweenYoungerAndElder().diffBetwnYoungerElder();
	}
}

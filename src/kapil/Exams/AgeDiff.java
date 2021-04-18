/*Program 2 :
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55;
*/
package kapil.Exams;

public class AgeDiff {

	void getElderAge(int[] str) {
		int maxage = str[0];
		int minage = str[0];

		for (int index = 1; index < str.length; index++) {
			if (maxage < str[index]) {
				maxage = str[index];
			}
			if (minage > str[index]) {
				minage = str[index];
			}
		}
		System.out.println("Age's difference of younger  and elder = " + (maxage - minage));
	}

	public static void main(String[] args) {
		AgeDiff agediff = new AgeDiff();
		int[] array = { 7, 12, 56, 62, 25 };
		agediff.getElderAge(array);
	}
}

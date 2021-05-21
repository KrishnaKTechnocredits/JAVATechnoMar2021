package madhavi_Raut.CodingExam.CodingExam_01;
/*Program 2 :
WAP to provide the difference between a Younger and an elder member of the family. 
Age is provided in the form of an array.
Sample Input: 7 12 56 62 25
Sample Output: 55*/

public class AgeDifference {

	void getAgeDifference(int[] age) {
		int maxNum = age[0], minNum = age[0];
		for (int index = 1; index < age.length; index++) {
			if (age[index] > maxNum) {
				maxNum = age[index];
			}
			if (age[index] < minNum) {
				minNum = age[index];
			}
		}
		System.out.println("Difference between a younger and an elder member age is " + (maxNum - minNum));
	}

	public static void main(String[] args) {
		new AgeDifference().getAgeDifference(new int[] { 7, 12, 56, 62, 25 });
	}
}
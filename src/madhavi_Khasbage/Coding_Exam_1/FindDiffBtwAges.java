package madhavi_Khasbage.Coding_Exam_1;
/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

public class FindDiffBtwAges {

	/* Find age difference */
	int calAgeDiff(int[] arrAges) {
		int ageDiff = 0;
		ageDiff = findMaxAge(arrAges) - findMinAge(arrAges);
		return ageDiff;
	}

	/* Find max number from array */
	int findMaxAge(int[] arrAges) {
		int max = arrAges[0];
		for (int index = 0; index < arrAges.length; index++) {
			if (arrAges[index] > max) {
				max = arrAges[index];
			}
		}
		return max;
	}
	
	/* Find min number from array */
	int findMinAge(int[] arrAges) {
		int min = arrAges[0];
		for (int index = 0; index < arrAges.length; index++) {
			if (arrAges[index] < min) {
				min = arrAges[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		FindDiffBtwAges findAgeDiff = new FindDiffBtwAges();
		int[] ageArray = { 7, 12, 56, 62, 25 };
		System.out.println(findAgeDiff.calAgeDiff(ageArray));
	}

}

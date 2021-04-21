package prachi.Coding_Exam_1;

/*Program 2 :
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/


public class AgeDifference {
	static int[] ageArr = { 7, 12, 56, 62, 25 };
	int minAge=ageArr[0];
	int maxAge=ageArr[0];
	int ageDiff=0;

	void getMaxAge(int[] input) {

		for (int index = 1; index < ageArr.length; index++) 
			if (ageArr[index] > maxAge) 
				maxAge=ageArr[index];
	}	

	void getMinAge(int[] input) {
		for (int index = 1; index < ageArr.length; index++) 
			if (ageArr[index] < minAge) {
				minAge=ageArr[index];
			}
	}

	void getageDiff() {
		ageDiff = maxAge-minAge;
		System.out.println("Difference between Maximum Age and Minimum Age is: "+ ageDiff);
	}

	public static void main(String[] args) {
		AgeDifference agediff = new AgeDifference();
		agediff.getMaxAge(ageArr);
		agediff.getMinAge(ageArr);
		agediff.getageDiff();
	}
}

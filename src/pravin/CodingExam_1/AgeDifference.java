package pravin.CodingExam_1;

public class AgeDifference {
	void ageDiff(int[] input) {
		int maxAge = input[0];
		int minAge = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxAge) {
				maxAge = input[index];
			}
			if (input[index] < minAge) {
				minAge = input[index];
			}
		}
		int diffOfAge = maxAge - minAge;
		System.out.println("Diff of age " + diffOfAge);
	}
	public static void main(String[] args) {
		int[] age = { 7, 12, 56, 62, 25 };
		new AgeDifference().ageDiff(age);
	}
}

package neha_Rathi.test;

public class AgeDifferance {

	void ageDiff(int[] sampleInput) {
		int max = sampleInput[0];
		int min = sampleInput[0];
		for (int index = 0; index < sampleInput.length; index++) {
			if (max < sampleInput[index])
				max = sampleInput[index];
			if (min > sampleInput[index])
				min = sampleInput[index];
		}
		System.out.println("Difference between age of elder member and younger member is: " + (max - min));
	}

	public static void main(String[] args) {
		AgeDifferance ageDifferance = new AgeDifferance();
		int[] sampleInput = { 7, 12, 56, 62, 25 };
		ageDifferance.ageDiff(sampleInput);
	}
}

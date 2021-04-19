package sai.Codingexam1;

public class YoungerElderDiff {

	public static void main(String[] args) {
		YoungerElderDiff youngerElderDiff = new YoungerElderDiff();
		int[] age = { 7, 12, 56, 62, 25 };
		youngerElderDiff.getAgeDiff(age);
	}

	void getAgeDiff(int[] age) {
		int minAge = age[0];
		int maxAge = age[0];
		for (int index = 1; index < age.length; index++) {
			if (minAge > age[index]) {
				minAge = age[index];}
			else if (maxAge < age[index]) {
				maxAge = age[index];
			}
		}
		System.out.println("Difference between the elder and younger member is " + (maxAge - minAge));
	}
}

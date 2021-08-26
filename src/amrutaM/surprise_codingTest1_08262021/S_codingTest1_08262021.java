package amrutaM.surprise_codingTest1_08262021;

/*Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52
*/
public class S_codingTest1_08262021 {

	void getSumOfAllDigits(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			String s = input[index];
			for (int innerIndex = 0; innerIndex < s.length(); innerIndex++) {
				if (Character.isDigit(s.charAt(innerIndex))) {
					sum += Character.getNumericValue(s.charAt(innerIndex));
				}
			}
		}
		System.out.println("Sum of all digits = "+sum);
	}

	public static void main(String[] args) {
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		S_codingTest1_08262021 codingTest1 = new S_codingTest1_08262021();
		codingTest1.getSumOfAllDigits(input);
	}
}

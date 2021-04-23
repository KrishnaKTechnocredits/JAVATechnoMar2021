package anubhav.arrayexamples;

/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
	Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3", "hgdhgdhgd"}
	Output : 6 14 12 15 7 4 */

public class SumOfDigitsInAStringInArray {

	int[] stringArray(String[] temp) {
		int[] output = new int[temp.length];
		for (int index = 0; index < temp.length; index++) {
			String s = temp[index];
			int sLength = s.length();
			int sum = 0;
			for (int innerIndex = 0; innerIndex < sLength; innerIndex++) {
				char ch = s.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			// System.out.println(sum);
			output[index] = sum;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] temp = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3",	"hgdhgdhgd" };
		SumOfDigitsInAStringInArray sumOfDigitsInAStringInArray = new SumOfDigitsInAStringInArray();
		int[] ch = sumOfDigitsInAStringInArray.stringArray(temp);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 0)
				System.out.print(ch[i] + " ");
		}
	}
}

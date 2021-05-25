/*
 return the name having maximum length.
 */

package ami.Assignment_17;

public class MaxLength {

	String returnMaxLengthRtn(String[] input) {
		int max = input[0].length();
		String maxName = input[0];

		for (int index = 1; index < input.length; index++) {
			if (input[index].length() > max) {
				max = input[index].length();
				maxName = input[index];
			}
		}
		return maxName;
	}

	public static void main(String[] args) {
		String[] word = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		MaxLength maxLength = new MaxLength();
		String maxL = maxLength.returnMaxLengthRtn(word);
		System.out.println("Maximum length Name:");
		System.out.println(maxL);
	}

}

package dhanshri.Assignment_24;

public class StringMiddleCharReturn {

	char[] getMiddleChar(String[] word) {
		char[] output = new char[3];
		int charcount = 0;

		for (int index = 0; index < word.length; index++) {
			if (word[index].length() % 2 == 0) {

				int index1 = word[index].length() / 2 - 1;
				output[charcount] = word[index].charAt(index1);
				charcount++;

			} else {
				if (word[index].length() % 2 != 0) {
					int index2 = word[index].length() / 2;
					output[charcount] = word[index].charAt(index2);
					charcount++;
				}

			}

		}
		return output;
	}

	public static void main(String[] args) {
		StringMiddleCharReturn stringMiddleCharReturn = new StringMiddleCharReturn();
		String[] arr = { "Techno", "Hello", "Credits" };
		char[] outputChar = stringMiddleCharReturn.getMiddleChar(arr);
		for (int index = 0; index < outputChar.length; index++) {
	    System.out.println(outputChar[index]);
		}
	}
}

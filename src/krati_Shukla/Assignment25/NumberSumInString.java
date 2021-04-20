//Write a method which will return sum of each all numbers in each String. Main method should print the output.

package krati_Shukla.Assignment25;

public class NumberSumInString {

	int[] NumberSum(String[] input) {
		
		int length = input.length;
		int[] output = new int[length];

		for (int index = 0; index < length; index++) {
			int total = 0;
			String newInput = input[index];
			int newLength = newInput.length();
			for (int newIndex = 0; newIndex < newLength; newIndex++) {
				char ch = newInput.charAt(newIndex);
				if (Character.isDigit(ch)) {
					int temp = Character.getNumericValue(ch);
					total = total + temp;
				}
			}
			//System.out.println(total);
			output[index] = total;
		}
		return output;
	}

	public static void main(String[] a) {
		NumberSumInString sumOfString = new NumberSumInString();
		String[] str = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] out = sumOfString.NumberSum(str);
		for (int i=0; i<out.length; i++)
			System.out.println(out[i]);

	}

}

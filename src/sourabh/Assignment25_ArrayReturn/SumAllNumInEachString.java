/*Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
*/

package sourabh.Assignment25_ArrayReturn;

public class SumAllNumInEachString {

	int[] getSumAllNumInEachString(String[] strInput) {
		int[] Output = new int[10];
		for (int index = 0; index < strInput.length; index++) {
			int digitSum = 0;
			for (int index1 = 0; index1 < strInput[index].length(); index1++) {
				char ch = strInput[index].charAt(index1);
				if (Character.isDigit(ch)) {
					int chtoNum = Character.getNumericValue(ch);
					digitSum = digitSum + chtoNum;
				}
				Output[index] = digitSum;
			}
			// Output[sumIndex]=digitSum;
			// sumIndex++;
		}
		return Output;
	}

	public static void main(String[] args) {
		SumAllNumInEachString sumAllNumInEachString = new SumAllNumInEachString();
		String[] strInput = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] output = sumAllNumInEachString.getSumAllNumInEachString(strInput);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0)
				System.out.println(output[index]);
		}

	}

}

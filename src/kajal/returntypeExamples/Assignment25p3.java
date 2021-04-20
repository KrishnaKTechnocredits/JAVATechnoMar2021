/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

package kajal.returntypeExamples;

public class Assignment25p3 {

		int[] getStringWithNum(String[] input) {
		int indexSum = 0;
		int[] arrWithNums = new int[input.length];
			for (int index = 0; index < input.length; index++) {
				int digitSum = 0;
				for (int innnerindex = 0; innnerindex < input[index].length(); innnerindex++) {
					char chartoCheck = input[index].charAt(innnerindex);
					
					if (Character.isDigit(chartoCheck)) {
						int charToNum = chartoCheck - '0';
						digitSum += charToNum;
					}
				}
				if (digitSum != 0) {
					arrWithNums[indexSum] = digitSum;
					indexSum++;
				} else
					indexSum++;
			}
			return arrWithNums;
		}
		
		public static void main(String[] args) {
		Assignment25p3 SumOfStringNumbers = new Assignment25p3();
	
		String[] Str = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] arrayOfSum = SumOfStringNumbers.getStringWithNum(Str);
		System.out.println("Sum of each all the numbers in each String is :");//here main method printing output
		
		for (int index = 0; index < arrayOfSum.length; index++) {
			System.out.println(arrayOfSum[index]);

	}
 }
}
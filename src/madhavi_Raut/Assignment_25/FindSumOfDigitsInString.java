package madhavi_Raut.Assignment_25;
/*Program 3: Write a method which will return sum of each all numbers in 
each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", 
"Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

public class FindSumOfDigitsInString {

	int[] getSumOfDigitsInString(String[] names) {
		int[] sumArray = new int[names.length];
		for (int index = 0; index < names.length; index++) {
			int sum = 0;
			for (int innerIndex = 0; innerIndex < names[index].length(); innerIndex++) {
				char ch = names[index].charAt(innerIndex);
				if (Character.isDigit(ch))
					sum += Integer.parseInt(String.valueOf(ch));
			}
			sumArray[index] = sum;
		}
		return sumArray;
	}

	public static void main(String[] args) {
		int[] sumArray = new FindSumOfDigitsInString().getSumOfDigitsInString(
				new String[] { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" });
		System.out.println("Below is the sum of digits in each name");
		for (int index = 0; index < sumArray.length; index++) {
			System.out.print(sumArray[index] +" ");
		}
	}
}

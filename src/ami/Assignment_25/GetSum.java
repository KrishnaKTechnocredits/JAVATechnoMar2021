/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
*/

package ami.Assignment_25;

public class GetSum {
	void findSum(String[] str) {
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			for (int innerIndex = 0; innerIndex < str[index].length(); innerIndex++) {
				if (Character.isDigit(str[index].charAt(innerIndex))) {
					sum = sum + Character.getNumericValue(str[index].charAt(innerIndex));
				}
			}
			System.out.print(sum + " ");
			sum = 0;
		}

	}

	public static void main(String[] args) {
		GetSum getSum = new GetSum();
		String[] str = { "Tech1No2Credits3", "Ha6rs8h", "Su9ra3bhi", "Shr1yas5h9", "Ash3vi4", "1Krishna3" };
		getSum.findSum(str);

	}

}

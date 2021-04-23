////Assignment25 Write a method which will return sum of each all numbers in each String. Main method should print the output.
//Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
//Output : 6 14 12 15 7 4

package neha_Rathi.assignment25;

public class SumOfnumInEveryString {

	int calSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	int[] calSumOfNum(String[] input) {
		int[] arr = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			arr[index] = calSum(input[index]);
		}
		return arr;
	}

	public static void main(String[] args) {
		SumOfnumInEveryString sumOfnumInEveryString = new SumOfnumInEveryString();
		String[] input = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] res = sumOfnumInEveryString.calSumOfNum(input);
		System.out.println("Addition of number for every string is: ");
		for (int index = 0; index < input.length; index++) {
			System.out.println(res[index]);
		}
	}
}

package mayur.assignment25;

public class StringSum {
	int[] getStringSum(String[] input) {
		int num = 0;
		int[] arrNum = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			int digitSum = 0;
			for (int innerindex = 0; innerindex < input[index].length(); innerindex++) {
				char chartoCheck = input[index].charAt(innerindex);
				if (Character.isDigit(chartoCheck)) {
					int charToNum = chartoCheck - '0';
					digitSum += charToNum;
				}
			}
			if (digitSum != 0) {
				arrNum[num] = digitSum;
				num++;
			} else
				num++;
		}
		return arrNum;
	}

	public static void main(String[] args) {

		StringSum string = new StringSum();
		String[] inputStr = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] arrSum= string.getStringSum(inputStr);
		System.out.println("Sum of each all the numbers in each String is :");
		for (int num = 0; num < arrSum.length; num++) {
			System.out.println(arrSum[num]);

		}
	}

}

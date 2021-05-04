package shashank.assignment_25;

public class SumOfNumbersInString {
	public void sumOfNumbers(String strArray[]) {
		boolean flag = false;
		int sum;
		for (int index = 0; index < strArray.length; index++) {
			sum = 0;
			char ch[] = strArray[index].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				flag = Character.isDigit(ch[j]);
				if (flag)
					sum += Character.getNumericValue(ch[j]);
			}
			System.out.println("Sum of number in string " + strArray[index] + " is " + sum);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String array[] = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		sumOfNumbersInString.sumOfNumbers(array);
	}
}

package shashank_assignment_19_22;

public class SumOfDigitOfString2 {

	public void sumOfDigit(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57)
				sum += str.charAt(index) - 48;
		}
		System.out.println("Sum of Digits of String is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitOfString2 sumOfDigitOfString2 = new SumOfDigitOfString2();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		sumOfDigitOfString2.sumOfDigit(str);
	}

}

package renuka.assignment20;

/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class Sum {
	
	void getSum(String str) {
		int digitSum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
			digitSum = digitSum + Character.getNumericValue(ch);

		}
		System.out.println(digitSum);
	}
	public static void main(String[] args) {
		Sum sum = new Sum();
		sum.getSum("J7yu9y8h1h8j4b7j3jjb6");

	}

}

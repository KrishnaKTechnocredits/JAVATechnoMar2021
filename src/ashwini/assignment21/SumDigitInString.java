package ashwini.assignment21;
/*
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

*/

public class SumDigitInString {
	void getCount(String str) {
		int digit = 0, sum = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= '0' && ch <= '9')
			
			//digit++;
			sum = sum = sum + Character.getNumericValue(str.charAt(index));
			
			}
		
		System.out.println("digit count : " + digit);
		System.out.println("sum is : " + sum);
	}
	

	public static void main(String[] args) {
		SumDigitInString sumDigitInString = new SumDigitInString();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		sumDigitInString.getCount(str);
	}

}

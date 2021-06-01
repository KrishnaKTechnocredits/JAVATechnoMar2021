package kangan.assignments.assignment_21;

/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
Withount using Char class*/

public class SumWithoutCharClass {
	
	void getSumWithoutChar(String str) {
		int digitSum = 0;
	
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
				if (ch>='0' && ch <= '9') {
					// int identifiedDigit = ch - '0';
					int identifiedDigit = Integer.parseInt(String.valueOf(ch));
			digitSum = digitSum + identifiedDigit;
			//digitSum=digitSum+Integer.parseInt(str);
		}
		}
		System.out.println(digitSum);
	}
	public static void main(String[] args) {
		SumWithoutCharClass sumWithoutCharClass = new SumWithoutCharClass();
		sumWithoutCharClass.getSumWithoutChar("J7yu9y8h1h8j4b7j3jjb6");	
	}

}

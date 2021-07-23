package gauravk.Assignment_20;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 20: 14th April'2021
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */
public class SumOfNumbersInString {
	
	int sumOfNumbersStringContent(String str) {
		int numericCount=0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				int value = Character.getNumericValue(str.charAt(i));
				numericCount = numericCount + value;
			}
		}
		return numericCount;
	}
	
	public static void main(String[] a) {
		int totalOfNumbers = new SumOfNumbersInString().sumOfNumbersStringContent("J7yu9y8h1h8j4b7j3jjb6");
		System.out.println("Total of number in a string is: "+totalOfNumbers);
	}

}

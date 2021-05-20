/*Coding Exam - 10 : 19th May'2021 [ 12 mins ]

Print the first non-repeated character of String.
Input : abcgbca
output : g

*/

package vaibhav.CoadingExam10;

public class NonRepetedCar2 {

	Character getFirstNonRepetedChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {

			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				ch = input.charAt(index);
				break;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		NonRepetedCar2 nonRepetedCar2 = new NonRepetedCar2();
		
		String inputStr = "abcgbca";
		
		char expectedChar = nonRepetedCar2.getFirstNonRepetedChar(inputStr);
		
		System.out.println("First non-repeated character of string is : " + expectedChar);

	}

}

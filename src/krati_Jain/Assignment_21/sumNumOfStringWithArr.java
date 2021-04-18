/* WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package krati_Jain.Assignment_21;

public class sumNumOfStringWithArr {

	int sumNum = 0;

	public static void main(String[] args) {
		sumNumOfStringWithArr sumNumObj = new sumNumOfStringWithArr();
		String inputStr = "J7yu9y8h1h8j4b7j3jjb6";
		sumNumObj.readStringNumbers(inputStr);
		System.out.println("Sum of all digits in String is: " + sumNumObj.sumNum);

	}

	void readStringNumbers(String inputStr) {
		int index = 0;
		for (index = 0; index < inputStr.length(); index++) {
			char stringToChar = inputStr.charAt(index);
			if (stringToChar >= '0' && stringToChar <= '9') {
				int identifiedDigit = stringToChar - '0';
				// System.out.println("identifiedDigit value : " + identifiedDigit);
				sumNum = sumNum + identifiedDigit;
			}
		}

	}

}

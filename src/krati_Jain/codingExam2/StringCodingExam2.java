/*Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"*/

package krati_Jain.codingExam2;

public class StringCodingExam2 {

	public static void main(String[] args) {

		StringCodingExam2 stringCodingExam2 = new StringCodingExam2();
		String inputStr = "12h14i4w8sdc15";
		System.out.println("Sum of all the numbers in the provided string is: " +stringCodingExam2.getStringWithNum(inputStr));

	}

	int getStringWithNum(String inputStr) {
		int index = 0;
		int innerIndex = 0;
		int sum = 0;
		int num = 0;

		for (index = 0; index < inputStr.length(); index++) {// 12h14i4w8sdc15
			int count = 0;
			String digitFound = ""; // 3/6
			char charCheck = inputStr.charAt(index);// 1 /4
			if (Character.isDigit(charCheck)) {// 1/4
				for (innerIndex = index + 1; innerIndex < inputStr.length(); innerIndex++) {// 1/2/4/5/7

					char nextchar = inputStr.charAt(innerIndex);// 2/h/4/i/w
					if (Character.isDigit(inputStr.charAt(innerIndex))) {
						digitFound = digitFound + charCheck + nextchar;// d = 12/14
						num = Integer.parseInt(digitFound);
						//System.out.println("digit found: " + num);// 12/14
						index = innerIndex; // index = 1, 4
						count++; // c = 1

					} else {
						index = innerIndex; // index = 2,5
						if (count == 0) {
							digitFound = "";
							digitFound = digitFound + charCheck;
							num = Integer.parseInt(digitFound);
							sum = sum + num;
							//System.out.println("digit found second: " + num);// 12/14
							//System.out.println("Final Sum 1: " + sum);
						} else {
							digitFound = digitFound + charCheck + nextchar;
							sum = sum + num;
							//System.out.println("Final Sum 2: " + sum);
						}
						break;
					}
				}

			}

		}

		sum = sum + num;
	
		return sum;

	}
}

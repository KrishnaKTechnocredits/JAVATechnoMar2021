package ankit.assignment_25;

public class SumOfDigitsInStringFromArray {

	static void CheckStringWithNumber(String str) {
		int sum = 0 ;
		for(int index = 0 ; index <str.length() ; index++)
			if (Character.isDigit(str.charAt(index))){
				int value = Character.getNumericValue(str.charAt(index));
				sum = sum + value;
			}System.out.println("In String "+str+" Sum of Digits is "+sum);
	}
	static void CheckStringWithNumberFromArray(String[] strArr) {
		for(int index =0 ; index < strArr.length ; index++) {
			CheckStringWithNumber(strArr[index]);
		}
	}

	public static void main(String[] args) {
		SumOfDigitsInStringFromArray sumOfDigitsInStringFromArray = new SumOfDigitsInStringFromArray();
		String[] strArr = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		SumOfDigitsInStringFromArray.CheckStringWithNumberFromArray(strArr);
	}
}

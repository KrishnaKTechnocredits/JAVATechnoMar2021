/*
 Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */


package ankit.assignment_25;

public class PrintStringWithNumber {

	void CheckStringWithNumber(String str) {
		for(int index = 0 ; index <str.length() ; index++)
			if (Character.isDigit(str.charAt(index))){
				System.out.println(str);
				break;
			}
	}
	void CheckStringWithNumberFromArray(String[] strArr) {
		for(int index =0 ; index < strArr.length ; index++) {
			CheckStringWithNumber(strArr[index]);
		}
	}

	public static void main(String[] args) {
		PrintStringWithNumber printStringWithNumber = new PrintStringWithNumber();
		String[] strArr = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		printStringWithNumber.CheckStringWithNumberFromArray(strArr);

	}

}

/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print
 the output.
 
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

package kajal.returntypeExamples;

public class Assignment25p2 {

	String[] stringContainNum(String[] inputStr) {

		String[] arrayWithNums = new String[5];
		int arrIndex = 0;
			for (int index = 0; index < inputStr.length; index++) { 
			boolean digitFlag = false;
			for (int innnerindex = 0; innnerindex < inputStr[index].length(); innnerindex++) {

				char chartoCheck = inputStr[index].charAt(innnerindex);
				if (Character.isDigit(chartoCheck)) {
					digitFlag = true;
					break;
				}

			}
			if (digitFlag == true) {
				arrayWithNums[arrIndex] = inputStr[index];
				arrIndex++;
			
			}
	}
			
		return arrayWithNums;
	}
	public static void main(String[] args) {

	Assignment25p2 stringWithNumbers = new Assignment25p2();

	String[] inputStr = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
	String[] arrString = stringWithNumbers.stringContainNum(inputStr);

	System.out.println("Strings in the array with atleast one number in them, are : ");
	System.out.println("-------------------------------------------------------- ");
	for (int index = 0; index < arrString.length; index++) {
		if (arrString[index] != null)
			System.out.println(arrString[index]);
	}
	}
}

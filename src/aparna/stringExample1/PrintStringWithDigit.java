/*Assignment - 25 : 18th April'2021
 * Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */
package aparna.stringExample1;

public class PrintStringWithDigit {

	String[] stringWithNumber(String[] inputNames) {
		String[] outputArray = new String[inputNames.length];
		int outputArrayIndex = 0;
		for (int index = 0; index < inputNames.length; index++) {
			String targetNames = inputNames[index];
			for (int innerIndex = 0; innerIndex < targetNames.length(); innerIndex++) {
				if (Character.isDigit(targetNames.charAt(innerIndex))) {
					outputArray[outputArrayIndex] = inputNames[index];
					outputArrayIndex++;
					break;
				}
			}

		}
		return outputArray;
	}

	public static void main(String[] args) {
		PrintStringWithDigit printStringWithDigit = new PrintStringWithDigit();
		String[] inputNames = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] outputArray = printStringWithDigit.stringWithNumber(inputNames);
		for (int index = 0; index < outputArray.length; index++) {
			if (outputArray[index] != null)
				System.out.println(outputArray[index]);
		}

	}

}

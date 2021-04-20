package madhavi_Khasbage.ArrayPrograms;

/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

public class FindNumberInString {

	String findStringHavingNum(String[] arrStr) {
		String finalString = "";
		for (int index = 0; index < arrStr.length; index++) {
			for (int index1 = 0; index1 < arrStr[index].length(); index1++) {
				if (Character.isDigit(arrStr[index].charAt(index1)) == true) {
					finalString += arrStr[index] + " ";
					break;
				}
			}
		}
		return finalString;
	}

	public static void main(String[] args) {
		FindNumberInString numInStr = new FindNumberInString();
		String[] arr = { "Techno11Credits", "HPytyuw", "Pd3R4K9", "Krish676na", "Aashvi25" };
		System.out.println(numInStr.findStringHavingNum(arr));
	}
}

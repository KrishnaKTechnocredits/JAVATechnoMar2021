package shivani.Assignment_25;

/*Write a method which will return all String from given array which  will return all one number. Main method should Print the output
Input : :"TechnoCredits" ,"HP1W","Pd3R4K9","Krishna" ,"Aashvi25"
Output: HP1W Pd3R4K9 Aashvi25*/

public class ReturnStringFromArray {
	String[] getStringDigit(String[] names) {
		String[] digitArray = new String[names.length];
		int count = 0;
		for (int index = 0; index < names.length; index++) {
			for (int innerIndex = 0; innerIndex < names[index].length(); innerIndex++) {
				if (Character.isDigit(names[index].charAt(innerIndex))) {
					digitArray[count] = names[index];
					count++;
					break;
				}
			}
		}
		return digitArray;
	}

	public static void main(String[] args) {
		String[] namesWithDigitArray = new ReturnStringFromArray()
				.getStringDigit(new String[] { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" });

		for (int index = 0; index < namesWithDigitArray.length; index++) {
			if (namesWithDigitArray[index] != null)
				System.out.println(namesWithDigitArray[index]);
		}
	}
}

package anubhav.arrayexamples;

/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */

public class StringsWithAtleastOneNumber {

	String[] findDigit(String[] temp) {
		String[] output= new String[10];
		for (int index = 0; index < temp.length; index++) {
			String element = temp[index];
			for (int innerIndex = 0; innerIndex < element.length(); innerIndex++) {
				if (Character.isDigit(element.charAt(innerIndex))) {
					output[index]= element; 
					break;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		StringsWithAtleastOneNumber stringsWithAtleastOneNumber = new StringsWithAtleastOneNumber();
		String[] temp = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		stringsWithAtleastOneNumber.findDigit(temp);
		String[] ch= stringsWithAtleastOneNumber.findDigit(temp);
		for (int i=0; i<ch.length; i++) {
			if (ch[i]!=null)
			System.out.print(ch[i] + " ");
		}
	}
}

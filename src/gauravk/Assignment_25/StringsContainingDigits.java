package gauravk.Assignment_25;
/*
 * After Lecture - 17_April_Session-26_PrimeNum After Lecture - 18_April_Session-27_Array_As_ReturnType Assignment - 25 : 18th April'2021
Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */
public class StringsContainingDigits {
	static int count=0;
	
	public static void main(String[] a) {
		String[] input = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] stringWithDigits = new StringsContainingDigits().stringDigitExtraction(input);
		System.out.println("All strings containing atleast one digits are :");
		for(int i=0; i<count; i++) {
			System.out.print(stringWithDigits[i]+",");
		}
	}
	
	String[] stringDigitExtraction(String[] names) {
		String[] arr = new String[names.length];
		for(int index=0; index<names.length; index++) {
			String targetString = names[index];
			boolean bool = true;
			for(int i=0; i<names[index].length(); i++) {
				if(Character.isDigit(names[index].charAt(i))) {
					bool = false;
					break;
				}
			}
			if(!bool) {
				arr[count]=targetString;
					count++;
			}
		}
		return arr;
	}
}
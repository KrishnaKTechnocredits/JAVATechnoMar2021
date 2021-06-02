/*
G 
G L 
G L O 
G L O B 
G L O B A 
G L O B A N 
G L O B A N T 
G L O B A N 
G L O B A 
G L O B 
G L O 
G L 
G
 */

package sourabh.CodingExam_19;

public class PattrenPrinting {
	static void pattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				char ch = str.charAt(innerIndex);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		for (int index = str.length() - 2; index >= 0; index--) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				char ch = str.charAt(innerIndex);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern("GLOBANT");
	}
}


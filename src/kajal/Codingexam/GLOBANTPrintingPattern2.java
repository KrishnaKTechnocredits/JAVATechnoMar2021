/*
Program 2 - Print below pattern
G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G
 */
package kajal.Codingexam;

public class GLOBANTPrintingPattern2 {

	public static void main(String[] args) {
		String str = "GLOBANT";
		for (int index = 0; index < str.length(); index++) {
			for (int innerIndex = 0; innerIndex < str.length() - index; innerIndex++) {
				System.out.print(str.charAt(innerIndex) + " ");
			}
			System.out.println();
		}
	}
}
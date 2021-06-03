/*
Coding_Exam_19

Program 1 - Print below pattern
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T
 */
package kajal.Codingexam;

public class GLOBANTPrintingPattern1 {

	public static void main(String[] args) {
		String str = "GLOBANT";
		for (int index = 1; index <= str.length(); index++) {

			for (int innerIndex = 0; innerIndex < index; innerIndex++) {
				System.out.print(str.charAt(innerIndex) + " ");
			}
			System.out.println(" ");
		}

	}
}

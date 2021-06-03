/*
Test 19 Print below pattern 1
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T
*/

package sandesh.coding_exam_19;

public class PatternGlobant {

	public void printInAscendingTheGivenString(String inpStr) {
		for (int index = 0; index < inpStr.length(); index++) {
			String out = "";
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				out = String.valueOf(inpStr.charAt(innerIndex));
				System.out.print(out + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String input = "GLOBANT";
		new PatternGlobant().printInAscendingTheGivenString(input);
	}
}
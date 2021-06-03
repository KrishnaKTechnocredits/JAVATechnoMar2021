/*
Test 19 Print below pattern 2
G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G
*/
package sandesh.coding_exam_19;

public class PatternReverseGlobant {

	public void printInReverseTheGivenString(String inpStr) {
		for (int index = inpStr.length(); index > 0; index--) {
			String out = "";
			for (int innerIndex = 0; innerIndex < index; innerIndex++) {
				out = String.valueOf(inpStr.charAt(innerIndex));
				System.out.print(out + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String input = "GLOBANT";
		new PatternReverseGlobant().printInReverseTheGivenString(input);
	}
}
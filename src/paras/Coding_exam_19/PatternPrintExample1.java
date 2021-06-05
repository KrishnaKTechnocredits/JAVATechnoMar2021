/*
Program 1 - Print below pattern
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T
 */
package paras.Coding_exam_19;

public class PatternPrintExample1 {

	void printPattern(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(input.charAt(j) + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternPrintExample1 patternPrintExample1 = new PatternPrintExample1();
		patternPrintExample1.printPattern("GLOBANT");
	}
}

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
package paras.Coding_exam_19;

public class PatternPrintExample2 {

	void printPattern1(String input) {
		int count = input.length();
		for (int i = 0; i <= input.length(); i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(input.charAt(j) + " ");
			}
			count--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintExample2 patternPrintExample2 = new PatternPrintExample2();
		patternPrintExample2.printPattern1("GLOBANT");
	}
}

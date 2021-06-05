package ravindra_J.coding_exam_19_PatternPrint;

public class Pattern90Degree {
	public void patternPrinting(String str) {
		for (int index = 0; index < str.length(); index++) {
			for (int charIndex = 0; charIndex <= index; charIndex++) {
				char ch = str.charAt(charIndex);
				System.out.print(ch);
			}
			System.out.print("\n");
		}

	}

}

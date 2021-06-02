package ravindra_J.coding_exam_19_PatternPrint;

public class ReversePattern {
	
	public void revPatternPrinting(String str) {
		
		for (int index = str.length(); index >= 0; index--) {
			for (int charIndex = 0; charIndex < index; charIndex++) {
				char ch = str.charAt(charIndex);
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}

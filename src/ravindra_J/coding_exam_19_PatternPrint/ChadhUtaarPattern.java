package ravindra_J.coding_exam_19_PatternPrint;

public class ChadhUtaarPattern {

	public void chadhUtaarPatternPrinting(String str) {
	
		for (int index = 0; index < str.length(); index++) {
			for (int charIndex = 0; charIndex <=index; charIndex++) {
				char ch = str.charAt(charIndex);
				System.out.print(ch);
			}
			System.out.println();
		}
		
		for (int revIndex = str.length(); revIndex >= 0; revIndex--) {
			for (int charIndex = 0; charIndex <revIndex; charIndex++) {
				char ch = str.charAt(charIndex);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
}

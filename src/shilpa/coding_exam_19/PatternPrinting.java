package shilpa.coding_exam_19;

public class PatternPrinting {
	void getPattern(String str) {
		for (int index1 = 0; index1 < str.length(); index1++) {
			for (int index2 = 0; index2 <= index1; index2++) {
				System.out.print(str.charAt(index2) + " ");
			}
			System.out.println();
		}
		for (int index3 = str.length() - 1; index3 > 0; index3--) {
			for (int index4 = 0; index4 <= index3 - 1; index4++) {
				System.out.print(str.charAt(index4) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrinting patternPrinting = new PatternPrinting();
		String str="GLOBANT";
		System.out.println("Pattern for given String '"+str+"' is\n");
		patternPrinting.getPattern(str);
	}
}

package mayur.coding_exam_19;

public class PatternPrinting {
	 void printing1(String input) {
		char[] ch = input.toCharArray();
		System.out.println("PATTERN 1");
		for (int row = 0; row <= ch.length - 1; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(ch[col] + " ");
			}
			System.out.println();
		}
	}

	 void printing2(String input) {
		char[] ch = input.toCharArray();
		System.out.println("PATTERN 2");
		for (int row = ch.length - 1; row >= 0; row--) {
			for (int k = 0; k <= ch.length - 1 - row; k++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {
				System.out.print(ch[col]);
			}
			System.out.println();
		}
	}

	void printing3(String input) {
		char[] ch = input.toCharArray();
		System.out.println("PATTERN 3");
		for (int row = 0; row <= ch.length - 1; row++) {
			for (int k = 0; k <= ch.length - 1 - row; k++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {
				System.out.print(ch[col]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	PatternPrinting printing = new PatternPrinting();
		printing.printing1("GLOBANT");
		printing.printing2("GLOBANT");
		printing.printing3("GLOBANT");
	}
}

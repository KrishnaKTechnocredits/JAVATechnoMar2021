package neha_Rathi.codingExam19;

public class PatternPrintingExp1 {
	static void printing1(String input) {
		char[] ch = input.toCharArray();
		System.out.println("-------1st pattern----------");
		for (int row = 0; row <= ch.length - 1; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(ch[col] + " ");
			}
			System.out.println();
		}
	}

	static void printing2(String input) {
		char[] ch = input.toCharArray();
		System.out.println("-------2nd pattern----------");
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

	static void printing3(String input) {
		char[] ch = input.toCharArray();
		System.out.println("-------3rd pattern----------");
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
		printing1("GLOBANT");
		printing2("GLOBANT");
		printing3("GLOBANT");
	}
}

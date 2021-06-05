package sai;

public class PatternPrinting {

	static void pattern(String str) {
		for (int index = 0; index < str.length(); index++) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				char ch = str.charAt(innerIndex);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		for (int index = str.length() - 2; index >= 0; index--) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				char ch = str.charAt(innerIndex);
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern("GLOBANT");
	}
}
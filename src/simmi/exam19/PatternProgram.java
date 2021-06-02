package simmi.exam19;

public class PatternProgram {
	static void pattern1(String str) {
		for (int index = 0; index < str.length(); index++) {
			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				System.out.print(str.charAt(innerIndex));
			}
			System.out.println();
		}
		System.out.println();
	}

	static void pattern2(String str) {
		for (int index = 0; index < str.length(); index++) {
			for (int innerIndex = 0; innerIndex < (6 - index) + 1; innerIndex++) {
				System.out.print(str.charAt(innerIndex));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String input = "GLOBANT";
		pattern1(input);
		pattern2(input);
	}
}

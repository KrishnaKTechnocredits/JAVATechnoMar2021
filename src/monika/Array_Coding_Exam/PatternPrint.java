package monika.Array_Coding_Exam;

public class PatternPrint {

	static void pattern3(String input) {
		System.out.println("-----Exam Pattern GLOBANT-----");
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(input.charAt(j) + " ");
			}
			System.out.println();
		}
	}

	static void pattern4(String input) {
		System.out.println("-----Exam Pattern GLOBANT Reverse-----");
		for (int j = input.length() - 1; j >= 0; j--) {
			System.out.println(input);
			input = input.replace(input.charAt(j), ' ');
		}
	}

	public static void main(String[] args) {
		pattern3("GLOBANT");
		pattern4("GLOBANT");
	}

}

package monali.coding_exam_19;

public class PatternPrinting {

	static public void pattern(String input) {
		char[] ch = input.toCharArray();

		for (int index = 0; index <= input.length() - 1; index++) {
			for (int i = 0; i <= index; i++) {
				System.out.print(ch[i] + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		String input = "GLOBANT";
		pattern(input);
	}

}

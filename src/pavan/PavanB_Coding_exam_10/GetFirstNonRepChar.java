package pavan.PavanB_Coding_exam_10;

public class GetFirstNonRepChar {

	void getchar() {

		String input = "ahbcgbcha";
		char ch;
		char ch1;

		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			for (int j = 0; j < input.length(); j++) {
				ch1 = input.charAt(j);
				if (ch == ch1)
					count++;

			}
			if (count == 1)
				System.out.println(ch);
			count = 0;

		}

	}

	public static void main(String[] args) {

		GetFirstNonRepChar g = new GetFirstNonRepChar();
		g.getchar();
	}

}

package mayur.coding_exam_6;


public class MaxChar {
	char getMaxChar(String str) {
		int maxCount = 0;
		int count = 0;
		char ch = ' ';

		for (int index = 0; index < str.length(); index++) {
			char ch1 = str.charAt(index);

			for (int innerindex = 0; innerindex < str.length(); innerindex++) {
				if (ch1 == str.charAt(innerindex))
					count++;
			}
			if (maxCount < count) {
				maxCount = count;
				count = 0;
				ch = ch1;
			} else {
				count = 0;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		MaxChar max = new MaxChar();
		char output = max.getMaxChar("globant india is hiring");
		System.out.println("Character having a maximum frequency is : " + output);
	}

}

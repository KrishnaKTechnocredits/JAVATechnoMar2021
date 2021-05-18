package shivani.coding_Exam_6;

public class MaxCharFrequency {

	char findMaxFrequency(String str) {
		int count = 0;
		int maxcount = 0;
		char ch = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			for (int index = 0; index < str.length(); index++) {
				if (ch1 == str.charAt(index)) {
					count++;
				}
			}

			if (maxcount < count) {
				maxcount = count;

				ch = ch1;
				count = 0;
			} else
				count = 0;

		}

		return ch;
	}

	public static void main(String[] args) {
		MaxCharFrequency maxCharFrequency = new MaxCharFrequency();
		String str = "globant india is hiring";
		char max = maxCharFrequency.findMaxFrequency(str);
		System.out.println("max repeated char is " + max);

	}

}

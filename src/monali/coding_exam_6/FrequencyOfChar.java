package monali.coding_exam_6;

public class FrequencyOfChar {
	
	void freqOfAllChar(String word) {
		char maxchar = word.charAt(0);
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			int maxcount = 1;
			char ch = word.charAt(index);
			if (word.indexOf(ch) != word.lastIndexOf(ch)) {
				for (int i = index + 1; i < word.length(); i++) {
					if ((String.valueOf(word.charAt(i))).equals(String.valueOf(ch))) {
						maxcount++;
					}
				}
				if (maxcount > count) {
					count = maxcount;
					maxchar = word.charAt(index);

				}

			}
		}
		System.out.println("character having max freq is "+maxchar);

	}

	public static void main(String[] args) {
		FrequencyOfChar freq = new FrequencyOfChar();
		freq.freqOfAllChar(" globant india is hiring");
	}

}

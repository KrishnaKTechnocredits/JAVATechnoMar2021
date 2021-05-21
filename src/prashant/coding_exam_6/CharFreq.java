// Coding Exam_6
// Input "glabant india is hiring";
// output i
package prashant.coding_exam_6;

public class CharFreq {
	char getChar(String str) {
		int Cnt = 0;
		int max = 0;
		char maxchar = ' ';
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 1 + i; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					Cnt++;
				}
			}
			if (max < Cnt) {
				max = Cnt;
				Cnt = 0;
				maxchar = ch[i];
			} else {
				Cnt = 0;
			}
		}
		return maxchar;
	}

	public static void main(String[] args) {
		CharFreq chfreq = new CharFreq();
		String str = "glabant india is hiring";
		Character max = chfreq.getChar(str);
		System.out.println("Char " + max + " is having maximum frequency");
	}
}

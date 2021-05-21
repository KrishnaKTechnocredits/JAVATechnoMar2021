package madhavi_Raut.CodingExam.Exam_06;
/*Find a Character having a maximum frequency.
input : globant india is hiring
output : i*/

public class FindMaxRepeatingChar {

	char getMaxRepeatingChar(String str) {
		int maxCount = 1;
		char maxCh = str.charAt(0);
		for (int index = 0; index < str.length(); index++) {
			int count = 1;
			char ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				for (int innerIndex = index + 1; innerIndex < str.length(); innerIndex++) {
					if ((String.valueOf(str.charAt(innerIndex))).equals(String.valueOf(ch))) {
						count++;
					}
				}
				if (count > maxCount) {
					maxCount = count;
					maxCh = str.charAt(index);
				}
			}
		}
		return maxCh;
	}

	public static void main(String[] args) {
		System.out.println("Below is the char repeating max time:");
		System.out.println(new FindMaxRepeatingChar().getMaxRepeatingChar("globant india is hiring"));
	}
}

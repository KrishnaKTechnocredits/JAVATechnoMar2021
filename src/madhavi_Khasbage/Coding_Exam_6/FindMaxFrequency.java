package madhavi_Khasbage.Coding_Exam_6;
/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.
input : globaooont india is hirinoooog
output : i*/

public class FindMaxFrequency {

	char getMaxFrequencyChar(String strInput) {
		int maxCnt = 0, tempCnt = 0;
		char maxFrqChr = ' ';
		String strTemp = strInput;
		for (int index = 0; index < strInput.length(); index++) {
			char ch = strInput.charAt(index);

			if (strTemp.contains(String.valueOf(ch))) {
				for (int index1 = 0; index1 < strTemp.length(); index1++) {
					if (ch == strTemp.charAt(index1)) {
						maxCnt++;
					}
				}

				if (maxCnt > tempCnt) {
					maxFrqChr = ch;
					tempCnt = maxCnt;
				}
				maxCnt = 0;
				strTemp = strTemp.replaceAll(String.valueOf(ch), "");				
			}
		}
		return maxFrqChr;
	}

	public static void main(String[] args) {
		FindMaxFrequency findMaxFrequency1 = new FindMaxFrequency();
		System.out.println("Maximum frequency character is : " + findMaxFrequency1.getMaxFrequencyChar("globant india is hiring"));
	}

}

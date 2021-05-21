/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.
input : "globant india is hiring";
output : i
*/
package ravindra_J.coding_exam_6;
class CharFrequency {
	static char ch1;

	static char getMaxCharFreq(String str) {
		int count = 0;
		int countArr[] = new int[str.length()];
		for (int index = 0; index < str.length(); index++) {

			for (int innerIndex = 1; innerIndex < str.length(); innerIndex++) {
				if (str.charAt(index) == str.charAt(innerIndex)) {
					count++;
				}
			}
			countArr[index] = count;
			count = 0;
			getMaxCount(str, countArr);
		}
		return ch1;
	}

	static int getMaxCount(String str, int countArr[]) {
		int maxNum = countArr[0];
		for (int index = 1; index < countArr.length; index++) {
			if (maxNum < countArr[index]) {
				maxNum = countArr[index];
				ch1 = str.charAt(index);
			}
		}
		return maxNum;
	}

	public static void main(String args[]) {
		String input = "globant india is hiring";
		System.out.println(getMaxCharFreq(input));
	}
}

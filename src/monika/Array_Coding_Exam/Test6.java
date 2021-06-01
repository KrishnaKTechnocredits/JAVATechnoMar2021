package monika.Array_Coding_Exam;
/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.
input : globant india is hiring
output : i
//Workable solution
*/

public class Test6 {
	char getMaxFreqChar(String input) {
		char tempChar = ' ';
		int maxFreqCount = 0;
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (input.charAt(index) == input.charAt(innerIndex)) {
					count++;
				}
			}
			if (count > maxFreqCount) {
				maxFreqCount = count;
				tempChar = input.charAt(index);
			}
		}
		return tempChar;
	}

	public static void main(String[] args) {
		Test6 obj = new Test6();
		char result = obj.getMaxFreqChar("globant india is hiring");
		System.out.println(result);

	}

}

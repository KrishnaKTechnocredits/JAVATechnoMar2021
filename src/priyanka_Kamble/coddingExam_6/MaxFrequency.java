package priyanka_Kamble.coddingExam_6;

/*
 * Find a Character having a maximum frequency.

input : globant india is hiring

output : i
 */
public class MaxFrequency {
	char ch = ' ', finalchr = ' ';
	int count = 0, maxCount = 0;
	//String str = "";
	
	void findMaxfreqChar(String input) {

		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++)
				if (String.valueOf(ch).equals(String.valueOf(input.charAt(innerIndex)))) {
					count++;
				}
			if (maxCount < count) {
				maxCount = count;
				count = 0;
				finalchr= ch;
			}else
				count=0;
		}
		 System.out.println("in given String '" +input + "' => char '" +finalchr+ "' appears max time ");
	}

	public static void main(String[] args) {

		String input = "globant india is hiring";
		new MaxFrequency().findMaxfreqChar(input);
		System.out.println();
	}
}

package pallavi.coding_exam_5;

/*Find a Character having a maximum frequency.

input : globant india is hiring

output : i
*/
public class CountMaxFrequency {

	char countFrequency(String str) {
		int max = 0;
		char maxchar = '0';
		for (int index = 0; index < str.length(); index++) {
			int count = 0;
			char targetChr = str.charAt(index);
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				char ch1 = str.charAt(innerIndex);
				if (ch1 == targetChr) {
					count++;
				}

			}
			if (count > max) {
				max = count;
				maxchar = str.charAt(index);
			}
			// count = 0;
			String targetToString = String.valueOf(targetChr);
			str = str.replace(targetToString, "");

		}
		return maxchar;

	}

	public static void main(String[] args) {
		String input = "globant india is hiring";
		input = input.replaceAll(" ", "");
		char output = new CountMaxFrequency().countFrequency(input);
		System.out.println("Max Char which is repeating :-> " +output);
	}

}

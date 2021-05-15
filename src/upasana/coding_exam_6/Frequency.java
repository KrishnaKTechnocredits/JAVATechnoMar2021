/*
 Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
 */

package upasana.coding_exam_6;

public class Frequency {
	static void frequency(String s1) {
		char maxC = ' ';
		int max = 0;
		int count = 0;

		for (int index = 0; index < s1.length(); index++) {
			count = 1;
			char ch = s1.charAt(index);
			for (int index1 = index + 1; index1 < s1.length(); index1++) {
				if (ch == s1.charAt(index1) && index == s1.indexOf(ch)) {
					if (s1.charAt(index1) == ' ') {

					} else
						count++;

				}

			}

			if (count > max) {
				max = count;
				maxC = s1.charAt(index);

			}
		}

		System.out.println(maxC + " has occured maximum times  : " + max);

	}

	public static void main(String[] args) {
		String str = "globant india is hirig";
		frequency(str);
	}
}

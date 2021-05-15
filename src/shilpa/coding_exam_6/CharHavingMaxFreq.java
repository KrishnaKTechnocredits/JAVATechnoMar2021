/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i*/
package shilpa.coding_exam_6;

public class CharHavingMaxFreq {
	String getCharHavingMaxFreq(String str) {
		String[] input = str.split("");
		int cnt = 1;
		int max = 0;
		String maxstr = "";
		for (int index1 = 0; index1 < input.length; index1++) {
			if (!input[index1].equals("0")) {
				for (int index2 = index1 + 1; index2 < input.length; index2++) {
					if (!input[index2].equals("0")) {
						if (input[index1].equals(input[index2])) {
							cnt++;
							input[index2] = "0";
						}
					}
				}
				if (cnt > max) {
					max = cnt;
					maxstr = input[index1];
				} else if (cnt == max) {
					maxstr = maxstr + " " + input[index1];
				}
				cnt = 1;
				input[index1] = "0";
			}
		}
		return maxstr;
	}
	public static void main(String[] args) {
		CharHavingMaxFreq charHavingMaxFreq = new CharHavingMaxFreq();
		String maxStr;
		maxStr = charHavingMaxFreq.getCharHavingMaxFreq("globant india is hiring");
		System.out.println("String with maximum frequency:- " + maxStr);
	}

}

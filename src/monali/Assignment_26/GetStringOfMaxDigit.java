package monali.Assignment_26;

public class GetStringOfMaxDigit {

	int getTotalDigit(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				count++;
		}
		return count;
	}

	String nameWithMaxDigit(String[] name) {
		String maxName = "";
		int num = 0;
		for (int index = 0; index < name.length; index++) {
			int cnt = getTotalDigit(name[index]);
			if (num < cnt) {
				cnt++;
				num = cnt;
				maxName = name[index];

			}
		}
		System.out.println(maxName);
		return maxName;
	}

	public static void main(String[] args) {
		String[] name = { "mo2n3al5i", "anu2r4a5d6h8a", "ajin5ky3a", };
		new GetStringOfMaxDigit().nameWithMaxDigit(name);
	}

}

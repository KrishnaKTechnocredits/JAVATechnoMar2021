package shashank.assignment_19_22;

public class CharArrayFrequency {

	private void countFrequency(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " occures " + count + "time in " + str);
	}

	private void allCharFrequency(String str2) {
		for (int index = 0; index < str2.length(); index++) {
			if (str2.indexOf(str2.charAt(index)) == index) {
				countFrequency(str2, str2.charAt(index));
			}
		}
	}

	private void arrayAllCharFrequency(String[] str3) {
		for (int index = 0; index < str3.length; index++) {
			allCharFrequency(str3[index]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharArrayFrequency charArrayFrequency = new CharArrayFrequency();
		String[] str3 = { "raj", "aarya", "aavrutti", "shruti" };
		charArrayFrequency.arrayAllCharFrequency(str3);
	}

}

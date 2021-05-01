package monali.Assignment_24;

public class GetMiddleChar {

	void middleChar(String[] str) {
		char[] output = new char[str.length];
		int length = 0;
		int middlechar = 0;
		for (int index = 0; index < str.length; index++) {
			String name = str[index];
			length = name.length();
			if (length % 2 == 0) {
				middlechar = length / 2 - 1;
				output[index] = name.charAt(middlechar);
			} else {
				middlechar = length / 2;
				output[index] = name.charAt(middlechar);

			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		GetMiddleChar character = new GetMiddleChar();
		String[] str = { "monali", "saurav", "vikas", "jyoti" };
		character.middleChar(str);
	}

}

package monali.Assignment_25;

public class Program_2 {

	int num = 0;

	int getStringOfDigit(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	String[] nameWithAtleastOneDigit(String[] name) {
		String[] input = new String[name.length];
		for (int i = 0; i < name.length; i++) {
			int cnt = getStringOfDigit(name[i]);
			if (num < cnt) {
				input[num] = name[i];
				num++;
				System.out.println(name[i]);

			}
		}
		return input;

	}

	public static void main(String[] args) {
		String[] names = { "mon3al5i", "sau5r6av", "vikas", "jy3o7t7i" };
		String[] answer = new Program_2().nameWithAtleastOneDigit(names);

	}
}

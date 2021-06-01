package monali.Assignment_22;

public class Program_1 {

	void getFrequencyOfCharacter(String str, char targetchar) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetchar)
				count++;
		}
		System.out.println("freq of char " + targetchar + " is " + count);

	}

	public static void main(String[] args) {
		Program_1 program = new Program_1();
		program.getFrequencyOfCharacter("monalivikastondare", 'a');
	}
}



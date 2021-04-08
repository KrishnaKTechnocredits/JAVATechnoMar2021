package monali.Assi_13_SwitchCase;

public class SwitchCase {

	void switchCase(char ch) {

		switch (ch) {
		case 'a':
			System.out.println("given char is vowel A");
			break;
		case 'b':
			System.out.println("given char is not vowel");
			break;
		case 'c':
			System.out.println("given char is vowel E");
			break;
		case 'd':
			System.out.println("given char is not vowel");
			break;
		case 'e':
			System.out.println("given char is vowel I");
			break;
		case 'f':
			System.out.println("given char is vowel O");
			break;
		case 'g':
			System.out.println("given char is vowel U");
			break;
		case 'h':
			System.out.println("given char is invalid input");
			break;
		}

	}

	public static void main(String[] a) {
		SwitchCase switchcase1 = new SwitchCase();
		switchcase1.switchCase('g');
		switchcase1.switchCase('a');
		switchcase1.switchCase('d');
		switchcase1.switchCase('b');
		switchcase1.switchCase('e');
		switchcase1.switchCase('c');
		switchcase1.switchCase('f');
		switchcase1.switchCase('h');
	}
}

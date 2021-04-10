package gaurav;

public class SwitchCase {

	void m1(char ch) {
		switch (ch) {
		case 'd':
			System.out.println("d is not a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCase m2 = new SwitchCase();
		System.out.print(" sample output 1: ");
		m2.m1('d');
		System.out.print(" sample output 2: ");
		m2.m1('I');
		System.out.print(" sample output 3: ");
		m2.m1('i');
	}
}

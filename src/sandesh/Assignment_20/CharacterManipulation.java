package sandesh.Assignment_20;

public class CharacterManipulation {
	
	void doCount(String inp) {
		int cntDigit = 0;
		int cntUpper = 0;
		int cntLower = 0;
		int cntSpe = 0;
		int length = inp.length();
		for(int i = 0; i < length; i++) {
			char ch = inp.charAt(i);
			if(Character.isDigit(ch))
				cntDigit++;
			else if(Character.isUpperCase(ch))
				cntUpper++;
			else if(Character.isLowerCase(ch))
				cntLower++;
			else
				cntSpe++;
		}
		System.out.println("Total digit: " + cntDigit);
		System.out.println("Total Letters: " + (cntUpper + cntLower));
		System.out.println("Total Uppercase: " + cntUpper);
		System.out.println("Total Lowercase: " + cntLower);
		System.out.println("Total Special char: " + cntSpe);
	}
	
	public static void main(String[] args) {
		CharacterManipulation cm1 = new CharacterManipulation();
		String input = "1rRpd3F9#K(E";
		cm1.doCount(input);
	}
}

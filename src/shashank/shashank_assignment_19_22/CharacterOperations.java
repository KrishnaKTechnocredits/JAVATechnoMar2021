package shashank_assignment_19_22;

public class CharacterOperations {

	public void countChar(String str) {
		int cntDigit = 0;
		int cntUpperCase = 0;
		int cntLowerCase = 0;
		int cntSpecialChar = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				cntUpperCase++;
			else if (Character.isLowerCase(str.charAt(index)))
				cntLowerCase++;
			else if (Character.isDigit(str.charAt(index)))
				cntDigit++;
			else
				cntSpecialChar++;
		}
		System.out.println("Total Upper Characters are " + cntUpperCase);
		System.out.println("Total Lower Characters are " + cntLowerCase);
		System.out.println("Total Digits are " + cntDigit);
		System.out.println("Total Special Characters are " + cntSpecialChar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterOperations characterOperations = new CharacterOperations();
		String str = "1rRpd3F9#K(E";
		characterOperations.countChar(str);
	}

}

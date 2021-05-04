package shashank.assignment_19_22;

public class CharacterOperation2 {

	public void charCount(String str) {
		int cntUpperCase = 0;
		int cntLowerCase = 0;
		int cntDigit = 0;
		int cntSpecialChar = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 65 && ch <= 90)
				cntUpperCase++;
			else if (ch >= 97 && ch <= 122)
				cntLowerCase++;
			else if (ch >= 48 && ch <= 57)
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
		CharacterOperation2 characterOperation2 = new CharacterOperation2();
		String str = "1rRpd3F9#K(E";
		characterOperation2.charCount(str);
	}

}

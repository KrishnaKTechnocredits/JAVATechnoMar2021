package sandesh.Assignment_21;

public class StringManipulationWoChar {
	
	void doCount(String str1) {
		int cntDigit = 0;
		int cntUpper = 0;
		int cntLower = 0;
		int cntSpe = 0;
		int length = str1.length();
		for(int i = 0; i < length; i++) {
			char ch = str1.charAt(i);
			if (ch >= 48 && ch <= 57)
				cntDigit++;
			else if(ch >= 65 && ch <= 90)
				cntUpper++;
			else if(ch >= 97 && ch <= 122)
				cntLower++;
			else
				cntSpe++;
		}
		System.out.println("Total digit: " + cntDigit);
		System.out.println("Total Letters: " + (cntLower + cntUpper));
		System.out.println("Total Uppercase: " + cntUpper);
		System.out.println("Total Lowercase: " + cntLower);
		System.out.println("Total Special char: " + cntSpe);
		
	}
	
	public static void main(String[] args) {
		StringManipulationWoChar sm1 = new StringManipulationWoChar();
		String str = "1rRpd3F9#K(E";
		sm1.doCount(str);
	}
}

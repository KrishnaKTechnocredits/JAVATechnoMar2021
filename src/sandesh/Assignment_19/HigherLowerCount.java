package sandesh.Assignment_19;

public class HigherLowerCount {
	
	String getUpperLowerCharCount(String str1) {
		int len = str1.length();
		char ch;
		int upperCaseCounter = 0;
		int lowerCaseCounter = 0;
		
		for (int i = 0 ; i < len; i++) {
			ch = str1.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCaseCounter++;
			}
			else if (ch >= 'a' && ch <= 'z') {
				lowerCaseCounter++;
			}
		}
		if (upperCaseCounter > lowerCaseCounter) {
			return "Techno";
		}
		else 
			return "Credits";
	}
	
	public static void main(String[] args) {
		String str = "TeCHnoSessionS";
		HigherLowerCount hl1 = new HigherLowerCount();
		String maxChars = hl1.getUpperLowerCharCount(str);
		System.out.println(maxChars);
	}
}
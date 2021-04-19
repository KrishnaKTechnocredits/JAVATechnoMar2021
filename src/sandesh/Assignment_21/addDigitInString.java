package sandesh.Assignment_21;

public class addDigitInString {
	
	void doAddition(String str1) {
		int length = str1.length();
		int sumDigit = 0;
		
		for(int i = 0; i < length; i++) {
			char ch = str1.charAt(i);
			if(ch >= 48 && ch <= 57)
				sumDigit = sumDigit + (ch-48);
		}
		System.out.println("Sum of all digits in String is: " + sumDigit);
	}
	
	public static void main(String[] args) {
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		addDigitInString ds1 = new addDigitInString();
		ds1.doAddition(input);
	}
}

package sandesh.Assignment_20;

public class SumNumbersString {
	
	void addNumber(String st1) {
		int digitSum = 0;
		int length = st1.length();
		for (int i = 0; i < length; i++) {
			char ch = st1.charAt(i);
			if(Character.isDigit(ch))
				digitSum = digitSum + (Character.getNumericValue(ch));
		}
		System.out.println("Sum of all digits in String is: " + digitSum);
	}
	
	public static void main(String[] args) {
		SumNumbersString sn1 = new SumNumbersString();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		sn1.addNumber(str);
	}
}

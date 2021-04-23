package trupti.String;

public class StringCount {
	
	void displayCount(String str) {
		int countDigits=0, countLetter=0, countUppCase=0, countLowCase=0, countSpecial =0;
		char c;
		int ascii;
		for(int index =0; index <str.length(); index++) {
			c = str.charAt(index);
			ascii = c;
			if(Character.isUpperCase(c)) {
				countUppCase++;
			
			}else if(Character.isLowerCase(c)){
				countLowCase++;
			}else if(Character.isDigit(c)){
				countDigits++;
			}else {
				countSpecial++;
			}
		}
		
			System.out.println("Total Digit : "+countDigits);
			countLetter = countUppCase + countLowCase;
			System.out.println("Total Letters : "+countLetter);
			System.out.println("Total Uppercase : "+countUppCase);
			System.out.println("Total Lowercase : "+countLowCase);
			System.out.println("Total Special char : "+countSpecial);

	}

	public static void main(String[] args) {
		StringCount stringcount=new StringCount();
		stringcount.displayCount("1rRpd3F9#K(E");
	}

}
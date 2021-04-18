package trupti.String;

public class StringCntDirect {
	void displayCount(String str) {
		int countDigits=0, countLetter=0, countUppCase=0, countLowCase=0, countSpecial =0;
		char c;
		int ascii;
		for(int index =0; index <str.length(); index++) {
			c = str.charAt(index);
			ascii = c;
			if(65<=ascii && ascii<=90) {
				countUppCase++;
			
			}else if(97<=ascii && ascii<=122){
				countLowCase++;
			}else if(48<=ascii && ascii<=57){
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
		StringCntDirect stringcntdirect=new StringCntDirect();
		stringcntdirect.displayCount("1rRpd3F9#K(E");

	}

}

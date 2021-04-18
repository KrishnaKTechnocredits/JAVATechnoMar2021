package trupti.String;

public class DigitCntDirect {
	void sumDigits(String str) {
		char c;
		int ascii;
		int sum=0;
		for (int index=0;index<str.length();index++) {
			c = str.charAt(index);
			ascii = c;
			if (48<=ascii && ascii<=57){
				sum=sum + Integer.parseInt(String.valueOf(c));
				
		}
		
	}
		System.out.println("Sum of all digits in String is "+sum);
	}	
	public static void main(String[] args) {
		DigitCntDirect digitcntdirect = new DigitCntDirect();
		digitcntdirect.sumDigits("J7yu9y8h1h8j4b7j3jjb6");

	}

}

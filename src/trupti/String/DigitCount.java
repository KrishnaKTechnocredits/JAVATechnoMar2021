package trupti.String;

public class DigitCount {
		void sumDigits(String str) {
			char c;
			int ascii;
			int sum=0;
			for (int index=0;index<str.length();index++) {
				c = str.charAt(index);
				ascii = c;
				if (Character.isDigit(c)){
					sum=sum + Character.getNumericValue(c);
					
			}
			
		}
			System.out.println("Sum of all digits in String is "+sum);
	}
	public static void main(String[] args) {
		DigitCount digitcount=new DigitCount();
		digitcount.sumDigits("J7yu9y8h1h8j4b7j3jjb6");

	}

}

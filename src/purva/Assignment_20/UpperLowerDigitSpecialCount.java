package purva.Assignment_20;

public class UpperLowerDigitSpecialCount {
	
	void charType(String input) {
		int uppercase = 0, lowercase = 0, digit = 0, specialchar = 0,letters = 0;
		for(int index = 0; index<input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index)))
				uppercase++;
			else if(Character.isLowerCase(input.charAt(index)))
				lowercase++;
			else if(Character.isDigit(input.charAt(index)))
				digit++;
			else 
				specialchar++;
					
		}
		
		System.out.println("Total digit: "+digit+"\nTotal letters: "+(uppercase+lowercase)+"\ntotal uppercase: "+uppercase+
				"\nTotal lowercase: "+lowercase+"\nTotal special character: "+specialchar);
		
	}
	
	public static void main(String [] args) {
		UpperLowerDigitSpecialCount upperLowerDigitSpecial = new UpperLowerDigitSpecialCount();
		upperLowerDigitSpecial.charType("1rRpd3F9#K(E");
		
	}
 
}

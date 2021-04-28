package aashay.Assignment_28;
/*
 * Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */

public class DigitUpperLowerChars {
	
	String sortedText(String text){
		String digit = "";
		String upperCaseChar = "" ;
		String lowerCaseChar = "";
		
		for(int index = 0 ; index < text.length() ; index++) {
			char ch = text.charAt(index);
			if(Character.isDigit(ch)) {
				digit += ch; 
			}else if(Character.isUpperCase(ch)) {
				upperCaseChar += ch;
			}else if(Character.isLowerCase(ch)) {
				lowerCaseChar += ch;
			}
		}
		
		return digit+upperCaseChar+lowerCaseChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitUpperLowerChars digitUpperLowerChars = new DigitUpperLowerChars(); 
		String msg = "Te1Ch2noCr4e_%$d8iTs9";
		String sortedText = digitUpperLowerChars.sortedText(msg);
		System.out.println(sortedText);
		
	}

}

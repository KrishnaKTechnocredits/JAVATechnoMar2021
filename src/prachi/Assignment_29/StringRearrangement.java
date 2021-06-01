package prachi.Assignment_29;

/*Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68
Hint : (45+5+111)FTTERTccde(12+56)*/

public class StringRearrangement {

	String stringReaarangement(String str) {

		String capitalLetters="";
		String smallLetters = "";
		String strNumbers ="";
		int sumOfOddNums = 0;
		int sumOfEvenNums = 0;

		for(int index=0;index <str.length();index++) {
			char ch = str.charAt(index);

			if(Character.isUpperCase(ch))
				capitalLetters = capitalLetters + ch;

			if (Character.isLowerCase(ch)) 
				smallLetters = smallLetters + ch;	

			if(Character.isDigit(ch)) {
				strNumbers = strNumbers+ch;

				if(index != str.length()-1){
					char ch1 = str.charAt(index+1);
					if(Character.isDigit(ch)&&Character.isLetter(ch1)) {
						if(Integer.parseInt(strNumbers) % 2 == 0) {
							sumOfEvenNums = sumOfEvenNums +Integer.parseInt(strNumbers);
							strNumbers="";
						}else
							sumOfOddNums =sumOfOddNums +Integer.parseInt(strNumbers);
						strNumbers ="";
					}	
				}
			}
		}
		if(strNumbers != "") {
			if(Integer.parseInt(strNumbers) % 2 == 0) 
				sumOfEvenNums = sumOfEvenNums +Integer.parseInt(strNumbers);
			else
				sumOfOddNums = sumOfOddNums +Integer.parseInt(strNumbers);
		}	
		return sumOfOddNums+capitalLetters+smallLetters+sumOfEvenNums;
	}

	public static void main(String[] args) {
		StringRearrangement sr = new StringRearrangement();
		String input = "F12TT45ERT5cc56de111prachi14";
		System.out.println("Input String is: "+input);
		String output=sr.stringReaarangement(input);
		System.out.println("Output String is: "+output);
	} 
}


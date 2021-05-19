/*
Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
 */
package radha.CodingTest10;

public class FirstNonRepeatingChar {
	
	char findFirstNonRepeatingChar(String input){
		char nonRepeating = ' ';
		for(int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				nonRepeating=ch;
				break;
			}
		}
		return nonRepeating;
	}
	
	public static void main(String[] args) {
		FirstNonRepeatingChar first = new FirstNonRepeatingChar();
		String input = "abcgbca";
		char ch = first.findFirstNonRepeatingChar(input);
		System.out.println("Given string is : "+input);
		System.out.println("1st non-repeating character from the string is : "+ch);
	}
}
/*
 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */


package pavan.Assignment_20;

public class SumNumInString {
	
	void checkSumnum(String input) {
		
		int sumDigit=0;
		for(int index=0;index<input.length();index++) {
			char ch= (input.charAt(index));
			
			if(Character.isDigit(ch)) {
				int dig= Character.getNumericValue(ch);
				
			
				sumDigit= sumDigit+dig;
			}
		}System.out.println("Sum of all Numbers in String is:="+ sumDigit);
		
	}
	
public static void main(String[] args) {
	SumNumInString sumNumInString= new SumNumInString();
	sumNumInString.checkSumnum("J7yu9y8h1h8j4b7j3jjb6");
}
}

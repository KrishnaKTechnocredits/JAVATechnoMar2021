/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter.
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
*/

package purva.Assignment_28;

public class SequenceOfCharInString {

	String printString(String msg) {
		String digit = "";
		String upperCase = "";
		String lowerCase = "";
		
		for(int index =0 ;index<msg.length();index++) {
			if(Character.isDigit(msg.charAt(index)))
				digit = digit + msg.charAt(index);
			else if(Character.isUpperCase(msg.charAt(index)))
				upperCase = upperCase + msg.charAt(index);
			else if(Character.isLowerCase(msg.charAt(index)))
				lowerCase = lowerCase + msg.charAt(index);				
		}
		
		return digit+upperCase+lowerCase;
	}
	public static void main(String[] a) {
		SequenceOfCharInString sequenceOfCharInString = new SequenceOfCharInString();
		String msg = "Te1Ch2noCr4e_%$d8iTs9";
		String output = sequenceOfCharInString.printString(msg);
		System.out.println(output);
		
	}
}

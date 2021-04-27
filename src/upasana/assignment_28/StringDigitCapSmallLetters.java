/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
*/

package upasana.assignment_28;

public class StringDigitCapSmallLetters {
	
	String getResult(String input) {
		
		String digit="";
		String cap="";
		String small="";
		
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit((input.charAt(index)))){
				digit = digit + (input.charAt(index));
			}
			else if(Character.isUpperCase((input.charAt(index)))){
				cap = cap + (input.charAt(index));
			} 
			else if(Character.isLowerCase((input.charAt(index)))){
				small = small + (input.charAt(index));
			} 
		}
		return digit+cap+small;
	}
	
	public static void main(String[] args) {
		String output=new StringDigitCapSmallLetters().getResult("12489TCCTehnoredis");
		System.out.println("Output is : "+output);
	}
}

package amrutaM.StringAssignments;
/*Write a method which takes one String parameter and return a reverse String.  
Hint : String getReverseString(String input){  return output; }  
input : technocredits 
output : stiderconhcet
*/
public class Assignment17_reverseString {

	 String getReverseString(String input) {
		 String output ="";
		 for(int index = input.length()-1; index>=0;index--) {
			 output+=input.charAt(index);
		 }
		 
		 return output;
	 }
	
	public static void main(String[] args) {
		Assignment17_reverseString stringRev = new Assignment17_reverseString();
		String input = "technocredits";
		String ans = stringRev.getReverseString(input);
		System.out.println("Inputed string is --> "+input +"\nReverse string is --> "+ans);
	}
}

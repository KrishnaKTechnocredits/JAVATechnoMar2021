package amrutaM.CodingTest6;
/*Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 
Time taken = 5 mins
*/
public class P1_NonRepeatingChar {

	void getFirstNonRepeatingChar(String input) {
		for(int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.println("First non repeating character in "+ input + " is "+ input.charAt(index));
				break;
			}
		}
	}
	public static void main(String[] args) {
		String input = "technocredits";
		new P1_NonRepeatingChar().getFirstNonRepeatingChar(input);
	}
}

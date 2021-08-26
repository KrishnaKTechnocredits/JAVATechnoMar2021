package amrutaM.StringAssignment19;

/*program 1: 
Find how many words in a given statement. 
input = "Hi Techno Credits Hello" 
output : 4 
*/
public class Program1_getWordCount {

	int getWordCount(String input) {
		String[] arr = input.split(" ");
		return arr.length;
	}

	public static void main(String[] args) {
		String input = "Hi Techno Credits Hello";
		System.out.println("Inputted string is --> " + input);
		Program1_getWordCount program1 = new Program1_getWordCount();
		System.out.println("\nTotal words in the inputted string are --> " + program1.getWordCount(input));

	}
}

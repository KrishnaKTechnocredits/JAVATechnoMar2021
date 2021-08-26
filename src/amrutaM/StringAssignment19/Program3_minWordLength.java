package amrutaM.StringAssignment19;

/*program 3 : 
Find minimum word length from given statement. 
input = "good morning technocredits hi hello"; */

public class Program3_minWordLength {

	void getMinWordLength(String input) {
		String[] words = input.split(" ");
		int min = words[0].length();
		String minLengthWord = "";
		for (int index = 1; index < words.length; index++) {
			if (words[index].length() < min) {
				min = words[index].length();
				minLengthWord = words[index];
			}
		}
		System.out.println("Minimum length word is --> " + minLengthWord + " and it's length is --> " + min);
	}

	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		Program3_minWordLength program3 = new Program3_minWordLength();
		program3.getMinWordLength(input);
	}
}

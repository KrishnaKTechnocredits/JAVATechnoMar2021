package amrutaM.StringAssignment19;
/*program 2: 
Find maximum word length from given statement. 
input = "good morning technocredits hi hello"; 
output : technocredits*/

public class Program2_maxWordLength {

	void getMaxWordLength(String input) {
		int max = 0;
		String maxLengthWord = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (max < arr[index].length()) {
				max = arr[index].length();
				maxLengthWord = arr[index];
			}
		}
		System.out.println("Word with max length is --> " + maxLengthWord + " and it's length is --> " + max);
	}

	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		Program2_maxWordLength program2 = new Program2_maxWordLength();
		program2.getMaxWordLength(input);
	}
}

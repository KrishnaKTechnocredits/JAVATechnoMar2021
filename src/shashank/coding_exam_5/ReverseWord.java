package shashank.coding_exam_5;

public class ReverseWord {
	String getReverseWordInString(String input) {
		String output = "";
		input = input.trim();
		String str[] = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			StringBuffer sb = new StringBuffer(str[index]);
			sb.reverse();
			output += sb + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWord reverseWord = new ReverseWord();
		String str = "    hi hello how are you";
		String output = reverseWord.getReverseWordInString(str);
		System.out.println(output);
	}

}

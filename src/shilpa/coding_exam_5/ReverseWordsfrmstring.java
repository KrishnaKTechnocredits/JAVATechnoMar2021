package shilpa.coding_exam_5;

public class ReverseWordsfrmstring {
	String getReverseWords(String str) {
		String[] input = str.split(" ");
		String revString = "";
		for (int index = 0; index < input.length; index++) {
			StringBuffer sb1 = new StringBuffer(input[index]);
			revString = revString + sb1.reverse().toString() + " ";

		}
		return revString;
	}

	public static void main(String[] args) {
		ReverseWordsfrmstring reverseWordsfrmstring = new ReverseWordsfrmstring();
		String output;
		output = reverseWordsfrmstring.getReverseWords("hi hello how are you");
		System.out.println(output);
	}
}

package sandesh.coding_exam_5;

public class ReverseEachWordInString {

	void reverseEachWord(String eachWord) {
		String reversedStr = "";
		StringBuffer sb = new StringBuffer(eachWord);
		sb.reverse();
		reversedStr += sb.toString();
		reversedStr += " ";
		System.out.print(reversedStr);
	}

	void getEachWord(String inpStr) {
		String trimmedStr = inpStr.trim();
		String[] strArray = trimmedStr.split(" ");
		for (int index = 0; index < strArray.length; index++) {
			reverseEachWord(strArray[index]);
		}
	}

	public static void main(String[] args) {
		String input = "hi hello how are you";
		new ReverseEachWordInString().getEachWord(input);
	}
}

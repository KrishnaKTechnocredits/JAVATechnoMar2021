/*Coding Exam 5
Input : "hi hello how are you"
	output :ih olleh woh era uoy
*/	
package prashant.Coding_exam_5;

public class RevWordStr {
	void getRevWordString(String input) {
		StringBuffer sb = new StringBuffer(input);
		System.out.print(" " + sb.reverse());
	}

	public static void main(String[] args) {
		RevWordStr strrev = new RevWordStr();
		String str = "hi hello how are you";
		String[] word = str.split(" ");
		System.out.println("Reverse word printing in given string");
		for (int i = 0; i < word.length; i++) {
			strrev.getRevWordString(word[i]);
		}
	}
}

package shivani.Assignment_19;

/*Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/
public class UpperLowerCase {
	String output;

	String uppercaseLowercaseCount(String str) {
		int uCnt = 0;
		char[] ch = new char[str.length()];

		for (int index = 0; index < str.length(); index++) {
			ch[index] = str.charAt(index);

			if (Character.isUpperCase(ch[index])) {
				uCnt++;
			}
			if (uCnt > (str.length() - uCnt)) {
				output = "Techno";
			}

			else {
				output = "credits";
			}
		}
		return output;
	}

	public static void main(String[] args) {
		UpperLowerCase upperLowerCase = new UpperLowerCase();
		upperLowerCase.uppercaseLowercaseCount("TeCHnoSessionS");
		System.out.println(upperLowerCase.output);

	}

}

//Program 28: WAP to return String having all numeric numbers first followed by Capital letter followed by small letter.

package kapil.ReturnStringAssi28;

public class ReturnString {

	String getString(String str) {
		String digitStr = "";
		String uppercaseStr = "";
		String lowercaseStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digitStr = digitStr + ch;
			else if (Character.isUpperCase(ch))
				uppercaseStr = uppercaseStr + ch;
			else if (Character.isLowerCase(ch))
				lowercaseStr = lowercaseStr + ch;
		}
		String output = digitStr + uppercaseStr + lowercaseStr;
		System.out.println(output);
		return output;
	}

	public static void main(String[] args) {
		ReturnString returnstring = new ReturnString();
		String msg = "Te1Ch2noCr4e_%$d8iTs9";
		returnstring.getString(msg);
	}
}
